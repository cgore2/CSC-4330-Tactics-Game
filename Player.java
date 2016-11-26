package dolphingame;


public class Player {
	
	public Unit[] unit = new Unit[5];
	public int turnNumber;
	public int score;
	//not sure about playerType

	
	public Player(){
	
	}
	
	//ADDS the selected unit too the Players array of units.. MAX UNITS 3, unitNum can be 1 2 or 3
	public void AddUnit(String s, int unitNum){
		if(s == "blue"){
			unit[unitNum - 1] = new Dolphin(0, 0, 10, 3, 1); // row0 col0 HP10 AP3 AR1
		}else if(s == "red"){
			unit[unitNum - 1] = new RedDolphin(0, 0, 10, 3, 1);
		}else{
			//if more units are added unit[unitNum - 1] = new GreenDolphin(0, 0, 10, 3, 1);
		}
		
	}
	 
	public void options(){
		
	}
	
	public int CheckScore(){
		return score;
	}
	 
}
