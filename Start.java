package data;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import helpers.Painter;

import static helpers.Painter.*;

/**
 * @author Daniel
 * Change Log:
 *  Daniel- original code
 * 	Mason- changes to Move(), start specifically some faulty logic repeated
 *  Stephan, Mason - changes to Move() changes to start() clear up 
 *  Daniel- finishing code 
 */


public class Start {
	public int moveXp;
	public int moveYp;
	public int moveXe, moveYe;
	public int movement;
	public Player p;
	public Player e;
	public SqGrid grid;
	public boolean entered = false;
	Square s;
	public boolean pTurn = true;
	public int countTurn = 0;
	public boolean turnMark = true;

	
	/**
	 * Moves a player in the direction desired, for the amount desired,
	 * after checking if the move is allowed
	 * 
	 * @throws InterruptedException
	 */
	public void Move() throws InterruptedException {
		while (Keyboard.next()) {
			if (Keyboard.getEventKeyState()) {
				if (Keyboard.getEventKey() == Keyboard.KEY_UP) {
					if (turnMark == true) {
						int move = this.moveYp - p.CheckMove(this.movement, "UP", grid);
						if (moveXp != moveXe || moveYp - move != moveYe)
							this.moveYp -= p.CheckMove(this.movement, "UP", grid);
					}
					turnMark = false;
				}

			}

			if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
				if (turnMark == true) {
					int move = p.CheckMove(this.movement, "LEFT", grid);
					if (moveXp - move != moveXe || moveYp != moveYe)
						this.moveXp -= p.CheckMove(this.movement, "LEFT", grid);
				}
				turnMark = false;
			}

			if (Keyboard.getEventKey() == Keyboard.KEY_DOWN) {
				if (turnMark == true) {
					int move = p.CheckMove(this.movement, "DOWN", grid);
					if (moveXp != moveXe || moveYp + move != moveYe)
						this.moveYp += p.CheckMove(this.movement, "DOWN", grid);
				}
				turnMark = false;
			}

			if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
				if (turnMark == true) {
					int move = p.CheckMove(this.movement, "RIGHT", grid);
					if (moveXp + move != moveXe || moveYp != moveYe)
						this.moveXp += move;
				}
				turnMark = false;
			}

			if (Keyboard.getEventKeyState()) {
				if (Keyboard.getEventKey() == Keyboard.KEY_M) {
					if (turnMark == true) {
						if (p.posX - e.posX <= 256 && p.posX - e.posX >= -256 && p.isAlive) {
							e.health -= 1;
						}
					}
					turnMark = false;
				}

			}
		}
		if (Keyboard.getEventKey() == Keyboard.KEY_W) {
			if ((turnMark == false)) {
				int move = e.CheckMove(this.movement, "UP", grid);
				if (moveXp != moveXe || moveYe - move != moveYp)
					this.moveYe -= e.CheckMove(this.movement, "UP", grid);
				turnMark = true;
			}
		}

		if (Keyboard.getEventKey() == Keyboard.KEY_A) {
			if (turnMark == false) {
				int move = e.CheckMove(this.movement, "LEFT", grid);
				if (moveXp != moveXe - move || moveYe != moveYp)
					this.moveXe -= e.CheckMove(this.movement, "LEFT", grid);
			}
			turnMark = true;
		}

		if (Keyboard.getEventKey() == Keyboard.KEY_S) {
			if (turnMark == false) {
				int move = e.CheckMove(this.movement, "DOWN", grid);
				if (moveXp != moveXe || moveYe + move != moveYp) {
					this.moveYe += e.CheckMove(this.movement, "DOWN", grid);
				}
				turnMark = true;
			}
		}

		if (Keyboard.getEventKey() == Keyboard.KEY_D) {
			if (turnMark == false) {
				int move = e.CheckMove(this.movement, "RIGHT", grid);
				if (moveXp != moveXe + move || moveYe != moveYp)
					this.moveXe += e.CheckMove(this.movement, "RIGHT", grid);
				turnMark = true;
			}
		}

		if (Keyboard.getEventKeyState()) {
			if (Keyboard.getEventKey() == Keyboard.KEY_F) {
				if (turnMark == false) {
					if (p.posX - e.posX <= 256 && p.posX - e.posX >= -256 && e.isAlive) {
						p.health -= 1;
					}
					turnMark = true;
				}
			}
		}

		if (e.health <= 0) {
			e.isAlive = false;
		}
		if (p.health <= 0) {
			p.isAlive = false;
		}
	}


	/**
	 * Starts the game
	 * 
	 * @throws InterruptedException
	 */
	public Start() throws InterruptedException {

		BeginSession(); //Creates the window

		
		//Creates a map depending on which int is stored in each element of the 2D array
		//Each number represents a certain Square with a specific texture
		int[][] map = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 4, 14 },
			        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 11, 14 },    
			        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14 },
			        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14 }, 
			        	{ 0, 0, 0, 0, 0, 0, 0, 5, 6, 0, 0, 0, 0, 0, 14 },
			        	{ 0, 0, 0, 0, 0, 0, 0, 7, 8, 0, 0, 0, 0, 0, 14 }, 
			        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14 },
			        	{ 0, 0, 0, 0, 0, 5, 6, 0, 0, 0, 0, 0, 0, 0, 14 },
			        	{ 0, 0, 0, 0, 0, 10, 12, 0, 0, 0, 0, 0, 0, 0, 14 },
			        	{ 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 1 } };
	
		//starts the player in square (1,0)
		this.moveXp = 0;
		this.moveYp = 64;
		
		//starts the player in square(8,13)
		this.moveXe = 832;
		this.moveYe = 512;
		
		this.movement = 64; //movement amount, 64 pixels
		
		int hp = 5;
		int he = 5;
		
		SqGrid grid = new SqGrid(map);
		Player p1 = new Player(grid.getStartX(), grid.getStartY(), hp);
		Player p2 = new Player(grid.getStartX(), grid.getStartY(), he);
		this.grid = grid;
		this.p = p1;
		this.e = p2;

		//While the window is open and Q is not pressed
		while (!Display.isCloseRequested() && Keyboard.getEventKey() != Keyboard.KEY_Q) {
			
			grid.Draw();
			
			if(p1.isAlive)
			{
			p1.addUnit(moveXp, moveYp, SqType.D);
			}
			if(p2.isAlive)
			{
			p2.addUnit(moveXe, moveYe, SqType.RD);
			}
			
			Move();

			if (!entered){
				DrawMenu(896,576);
				entered = true;
			}
			Display.update(); //updates the display
			Display.sync(60); //60 FPS
		}

		Display.destroy(); //closes the window
	}

	public static void main(String[] args) throws InterruptedException {
		
		new Start();
	}

}
