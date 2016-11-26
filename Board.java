package dolphingame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * Most of the code for the GUI and GAME LOGIC goes in this class
 */

public class Board extends JPanel implements ActionListener{
	
    public Square[][] grid = new Square[5][5]; 

	
	public Board() {
		
		startGame();
		//addKeyListener(..)
		
	}
	
	private void startGame(){
		
	}
	
	private void gameOver(){
		
	}
	
	//Menu()
	//levelSelcect()
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

//updating the grid after a move
//grid[z.getRow()][z.getColumn()] = new Square(z.getRow(), z.getColumn())

