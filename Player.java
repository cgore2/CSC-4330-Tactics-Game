package data;

import static helpers.Painter.*;

public class Player {
	public boolean isAlive;
	public int posX, posY;
	public int startX, startY;
	public int health;
	Square s;


		/**
		 * Creates a Player that isAlive, with a start position, a 
		 * current position, and health
		 * 
		 * @param startX  X coordinate at start
		 * @param startY Y coordinate at start
		 * @param startH Health amount at start
		 */
		public Player(int startX, int startY , int startH){
			this.isAlive = true;
			this.startX=startX;
			this.startY=startY;
			this.posX=0;
			this.posY=0;
			this.health = startH;
			
		}
		
		/**
		 * Creates a Square with a texture drawn to it and a position
		 * @param moveX X coordinate
		 * @param moveY Y coordinate
		 * @param t Texture to be drawn
		 */
		public void addUnit(int moveX, int moveY, SqType t){
			s = new Square(this.startX+moveX, this.startY+moveY, 64, 64, t);
			this.posX = this.startX+moveX;
			this.posY = this.startY+moveY;
			DrawSqTex(s.getTexture(),s.getX(),s.getY()-14,s.getW(),s.getH());
		}
		
		

		
		/**
		 * Checks if a Square can move to an existing Square
		 * 
		 * @param movement the amount of pixels it will move
		 * @param direction the direction it will move in
		 * @param grid the grid it will move on
		 * @return 0 if the Square is null, 64 if not
		 */
		public int CheckMove(int movement, String direction, SqGrid grid){
			Square sq = checkIfSqExists(direction,grid);
			
			int returnVal=64;
			if(sq == null){
				returnVal=0;
			}
			return returnVal;
		}
	
		
		/**
		 * Checks if the Square in a certain direction exist
		 * 
		 * @param direction
		 * @param grid
		 * @return null if it cannot be moved too, otherwise return the position to move too
		 */
		public Square checkIfSqExists(String direction, SqGrid grid){
			Square returnVal=null;
			
			
			if(direction.equals("UP")){
				returnVal = grid.getSq(getPosX()/64, (getPosY()-64)/64); 
				
				//numbers 1,5-14 represent textures on the grid  (certain ones cannot be moved too)
				
				if(  grid.getMapVal(getPosX()/64, (getPosY()-64)/64) == 1 
						|| grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 5 
						|| grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 6
						|| grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 7
						|| grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 8
						|| grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 9
						|| grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 10
						|| grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 11
						|| grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 12
					    || grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 13
					    || grid.getMapVal(getPosX()/64, (getPosY()-64)/64)== 14)
					returnVal=null;
			}else if(direction.equals("LEFT")){
				returnVal = grid.getSq((getPosX()-64)/64, getPosY()/64);
				if(  grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 1
						|| grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 5
						|| grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 6
						|| grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 7
						|| grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 8
						|| grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 9
						|| grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 10
						|| grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 11
						|| grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 12
					    || grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 13
					    || grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 14)
					returnVal=null;
			}else if(direction.equals("DOWN")){
				returnVal = grid.getSq(getPosX()/64, (getPosY()+64)/64);
				if( grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 1 	
						|| grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 5
						|| grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 6
						|| grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 7
						|| grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 8
						|| grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 9
						|| grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 10
						|| grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 11
						|| grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 12
					    || grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 13
					    || grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 14)
					returnVal=null;
			}else if(direction.equals("RIGHT")){
				returnVal = grid.getSq((getPosX()+64)/64, getPosY()/64);
				if(  grid.getMapVal((getPosX()+64)/64, getPosY()/64) == 1
						|| grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 5
						|| grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 6
						|| grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 7
						|| grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 8
						|| grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 9
						|| grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 10
						|| grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 11
						|| grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 12
					    || grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 13
					    || grid.getMapVal((getPosX()+64)/64, getPosY()/64)== 14)
					returnVal=null;
			}
			return returnVal;
		}
	
		/**
		 * @return the X coordinate of the Players position
		 */
		public int getPosX(){
			return posX;
		}
		
		/**
		 * @return the Y coordinate of the Players position
		 */
		public int getPosY(){
			return posY;
		}
}
