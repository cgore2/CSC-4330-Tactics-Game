package data;


import static helpers.Painter.*;

public class SqGrid {
	
	public Square[][] map;
	public int startX;
	public int startY;
	public int gridX = 15, gridY = 10;
	public int[][] OriginalMap;
	
        /**
         * This is when the program will convert a predefined 2D int array into
         * a 2D square array.
         * @param newMap int[][]
         */
	public SqGrid(int[][] newMap){
		OriginalMap=newMap;
		map = new Square[gridX][gridY];
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				switch(newMap[j][i]){
				case 0:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.Water);
					break;
				case 1:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.O);
					break;
				case 2:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.D);
					break;
				case 3:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.RD);
					break;
				case 4:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.Tree);
					break;
				case 5:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.SNW);
					break;
				case 6:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.SNE);
					break;
				case 7:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.SSW);
					break;
				case 8:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.SSE);
					break;
				case 9:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.SN);
					break;
				case 10:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.SW);
					break;
				case 11:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.SS);
					break;
				case 12:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.SE);
					break;
				case 13:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.ON);
					break;
				case 14:
					map[i][j] = new Square(i*64, j*64, 64, 64, SqType.OW);
					break;


				}
			}
		}	
	}
        
        /**
         * This will draw out specific integer values from the original 2D 
         * int array.
         * @param i first int value
         * @param j second int value
         * @return int value at position i,j in 2d array
         */
	public int getMapVal(int i, int j)
	{
		if(i<0||j<0)
			return 1;
		else
			return OriginalMap[j][i];
	}
	
        /**
         * gets the startX value
         * @return int startX
         */
	public int getStartX(){
		return startX;
	}
	
        /**
         * gets the startY value 
         * @return int startY
         */
	public int getStartY(){
		return startY;
	}
	
        
        /**
         * Gets the Grid X value
         * @return the int gridX 
         */
	public int getGridX(){
		return gridX;
	}
	
        /**
         * gets the grid y value
         * @return the int gridY
         */
	public int getGridY(){
		return gridY;
	}
	
	
	/**
         * set/replaces the int x coordinate, int y coordinate, and one of the 
         * predefined SqTypes into a square.
         * @param x int 
         * @param y int
         * @param type predefined SqType
         */
	public void setSq(int x, int y, SqType type){
		map[x][y] = new Square(x*64, y*64, 64, 64, type);
	}
	
	/**
         * gets a specific specified square according to the int x coordinate
         * and int y coordinate.
         * @param x int x coordinate
         * @param y int y coordinate
         * @return  a specific Square
         */
	public Square getSq(int x, int y){
		Square returnVal = null;
		try{
			returnVal=this.map[x][y];
		}catch(ArrayIndexOutOfBoundsException e){
			returnVal = null;
		}
		return returnVal;
	}

        /**
         * This function draws the a filled 2D Square array which 
         * represent the game grid. 
         */
	public void Draw(){
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				Square t = map[i][j];
				DrawSqTex(t.getTexture(), t.getX(), t.getY(), t.getW(), t.getH());
			}
		}
	}
	
}

