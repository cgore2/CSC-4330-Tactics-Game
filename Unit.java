package dolphingame;

public abstract class Unit {
	
	private int HitPoints;
	private int AttPoints;
	private int AttRange;
	public Square position = new Square(0,0);
	
	//EACH unit will have a Square holding its position
	public Unit(int r, int c, int hp, int ap, int ar){
		
		position.setRow(r);
		position.setColumn(c);
		HitPoints = hp;
		AttPoints = ap;
		AttRange = ar;
			
	}
	
	public void MoveUnit(Square z){
		position.setRow(z.getRow());
		position.setColumn(z.getColumn());
        
	}
	
	public void Attack(Unit unit){
		unit.HitPoints -= this.AttPoints;
	}
	
	public int getHP(){
		return HitPoints;
	}
	
	public int getAP(){
		return AttPoints;
	}
	
	public int getAR(){
		return AttRange;
	}
	
	public Square getPos(){
		return position;
	}
	
	public boolean isAlive(){
            return this.HitPoints > 0;
        }
	//checkStatus()
	
	
}
