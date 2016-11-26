package dolphingame;

public class Unit {
	
	private int HitPoints;
	private int AttPoints;
	private int AttRange;
	
	public Unit(int hp, int ap, int ar){
		
		HitPoints = hp;
		AttPoints = ap;
		AttRange = ar;
			
	}
	
	public void MoveUnit(Square s, Square z){
		s.setRow(z.getRow());
        s.setColumn(z.getColumn());
        
	}
	
	public void Attack(){
		
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
	
	//checkStatus()
	
	
}
