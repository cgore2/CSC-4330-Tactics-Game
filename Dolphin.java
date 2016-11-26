package dolphingame;

public class Dolphin extends Unit{

	public Dolphin(int hp, int ap, int ar){
		
		super(hp, ap, ar);
	
	}
	
	@Override
	public void MoveUnit(Square s, Square z){
		s.setRow(z.getRow());
        s.setColumn(z.getColumn());
	}

}
