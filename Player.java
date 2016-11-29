package data;

import static helpers.Painter.*;

public class Player {
	public int currentPos;
	public boolean isAlive;
	public int posX, posY;
	public int startX, startY;
	public int health;
	Square s;

		
		
	
		
		public Player(int startX, int startY , int startH){
			this.isAlive = true;
			this.startX=startX;
			this.startY=startY;
			this.posX=0;
			this.posY=0;
			this.health = startH;
			
		}
		
		public void addUnit(int moveX, int moveY, SqType t){
			s = new Square(this.startX+moveX, this.startY+moveY, 64, 64, t);
			this.posX = this.startX+moveX;
			this.posY = this.startY+moveY;
			DrawSqTex(s.getTexture(),s.getX(),s.getY(),s.getW(),s.getH());
		}
		
		public int CheckMove(int movement, String direction, SqGrid grid){
			Square sq = checkIfSqExists(direction,grid);
			
			int returnVal=64;
			if(sq == null){
				returnVal=0;
			}
			return returnVal;
		}
		
	
		
		public Square checkIfSqExists(String direction, SqGrid grid){
			Square returnVal=null;
			if(direction.equals("UP")){
				returnVal = grid.getSq(getPosX()/64, (getPosY()-64)/64); 
				if(  grid.getMapVal(getPosX()/64, (getPosY()-64)/64) == 1)
					returnVal=null;
			}else if(direction.equals("LEFT")){
				returnVal = grid.getSq((getPosX()-64)/64, getPosY()/64);
				if(  grid.getMapVal((getPosX()-64)/64, getPosY()/64)== 1)
					returnVal=null;
			}else if(direction.equals("DOWN")){
				returnVal = grid.getSq(getPosX()/64, (getPosY()+64)/64);
				if(  grid.getMapVal(getPosX()/64, (getPosY()+64)/64)== 1)
					returnVal=null;
			}else if(direction.equals("RIGHT")){
				returnVal = grid.getSq((getPosX()+64)/64, getPosY()/64);
				if(  grid.getMapVal((getPosX()+64)/64, getPosY()/64) == 1)
					returnVal=null;
			}
			return returnVal;
		}
		
		public void setPos(int pos){
			this.currentPos = pos;
		}
		
		public int getPosX(){
			return posX;
		}
		
		public int getPosY(){
			return posY;
		}
}
