package dolphingame;


public class Player extends Board {
	
	public Unit[] unit = new Unit[5];
	public int turnNumber;
	public int score;
	//not sure about playerType

	
	public Player(){
	
	}
	
	//ADDS the selected unit too the Players array of units
	public void AddUnit(String s, int unitNum){
		if(s == "blue"){
			unit[unitNum] = new Dolphin(0, 0, 10, 3, 1); // row0 col0 HP10 AP3 AR1
		}else if(s == "red"){
			unit[unitNum] = new RedDolphin(0, 0, 10, 3, 1);
		}else{
			//if more units are added unit[0] = new GreenDolphin(0, 0, 10, 3, 1);
		}
		
	}
	 
	public void options(){
		
	}
	
	public int CheckScore(){
		return score;
	}
	 
}
