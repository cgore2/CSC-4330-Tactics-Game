package data;


import static helpers.Painter.*;

public class SqGrid {
	
	public Square[][] map;
	public int startX;
	public int startY;
	public int gridX = 15, gridY = 10;
	public int[][] OriginalMap;
	
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
	public int getMapVal(int i, int j)
	{
		if(i<0||j<0)
			return 1;
		else
			return OriginalMap[j][i];
	}
	
	public int getStartX(){
		return startX;
	}
	
	public int getStartY(){
		return startY;
	}
	
	public int getGridX(){
		return gridX;
	}
	
	public int getGridY(){
		return gridY;
	}
	
	
	
	public void setSq(int x, int y, SqType type){
		map[x][y] = new Square(x*64, y*64, 64, 64, type);
	}
	
	//important
	public Square getSq(int x, int y){
		Square returnVal = null;
		try{
			returnVal=this.map[x][y];
		}catch(ArrayIndexOutOfBoundsException e){
			returnVal = null;
		}
		return returnVal;
	}


	public void Draw(){
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				Square t = map[i][j];
				DrawSqTex(t.getTexture(), t.getX(), t.getY(), t.getW(), t.getH());
			}
		}
	}
	
}

