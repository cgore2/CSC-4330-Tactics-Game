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
		
		initializeGrid();
		startGame();
		//addKeyListener(..)
		
	}
	
	private void initializeGrid(){

		grid[0][0] = new Square(0,0);
		grid[0][1] = new Square(0,1);
		grid[0][2] = new Square(0,2);
		grid[0][3] = new Square(0,3);
		grid[0][4] = new Square(0,4);
   
		grid[1][0] = new Square(1,0);
		grid[1][1] = new Square(1,1);
		grid[1][2] = new Square(1,2);
		grid[1][3] = new Square(1,3);
		grid[1][4] = new Square(1,4); 

		grid[2][0] = new Square(2,0);
		grid[2][1] = new Square(2,1);
		grid[2][2] = new Square(2,2);
		grid[2][3] = new Square(2,3);
		grid[2][4] = new Square(2,4);

		grid[3][0] = new Square(3,0);
		grid[3][1] = new Square(3,1);
		grid[3][2] = new Square(3,2);
		grid[3][3] = new Square(3,3);
		grid[3][4] = new Square(3,4);

		grid[4][0] = new Square(4,0);
		grid[4][1] = new Square(4,1);
		grid[4][2] = new Square(4,2);
		grid[4][3] = new Square(4,3);
		grid[4][4] = new Square(4,4);

	}
	
	private void startGame(){
		
	}
	
	private void gameOver(){
		//IMPLEMENT ME
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

