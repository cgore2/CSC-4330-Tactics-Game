package data;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import helpers.Painter;

import static helpers.Painter.*;

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

	
	/**
	 * Moves a player in the direction desired, for the amount desired,
	 * after checking if the move is allowed
	 * 
	 * @throws InterruptedException
	 */
	public void Move() throws InterruptedException {
		while (Keyboard.next()) {
			if (Keyboard.getEventKeyState()) {
				//blue dolphin up
				if (Keyboard.getEventKey() == Keyboard.KEY_UP) {
					int move = this.moveYp - p.CheckMove(this.movement, "UP", grid);
					if (moveXp != moveXe || moveYp - move != moveYe)
						this.moveYp -= p.CheckMove(this.movement, "UP", grid);
				}
				//blue dolphin left
				if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
					int move = p.CheckMove(this.movement, "LEFT", grid);
					if (moveXp - move != moveXe || moveYp != moveYe)
						this.moveXp -= p.CheckMove(this.movement, "LEFT", grid);

				}
				//blue dolphin down
				if (Keyboard.getEventKey() == Keyboard.KEY_DOWN) {
					int move = p.CheckMove(this.movement, "DOWN", grid);
					if (moveXp != moveXe || moveYp + move != moveYe)
						this.moveYp += p.CheckMove(this.movement, "DOWN", grid);
				}
				//blue dolphin right
				if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
					int move = p.CheckMove(this.movement, "RIGHT", grid);
					if (moveXp + move != moveXe || moveYp != moveYe)
						this.moveXp += move;
				}
				//red dolphin up using W
				if (Keyboard.getEventKey() == Keyboard.KEY_W) {
					int move = e.CheckMove(this.movement, "UP", grid);
					if (moveXp != moveXe || moveYe - move != moveYp)
						this.moveYe -= e.CheckMove(this.movement, "UP", grid);
				}
				//red dolphin left using A
				if (Keyboard.getEventKey() == Keyboard.KEY_A) {
					int move = e.CheckMove(this.movement, "LEFT", grid);
					if (moveXp != moveXe - move || moveYe != moveYp)
						this.moveXe -= e.CheckMove(this.movement, "LEFT", grid);
				}
				//red dolphin down using S
				if (Keyboard.getEventKey() == Keyboard.KEY_S) {
					int move = e.CheckMove(this.movement, "DOWN", grid);
					if (moveXp != moveXe || moveYe + move != moveYp)
					{
						this.moveYe += e.CheckMove(this.movement, "DOWN", grid);
					}
					
				}
				//red dolphin right using D
				if (Keyboard.getEventKey() == Keyboard.KEY_D) {
					int move = e.CheckMove(this.movement, "RIGHT", grid);
					if (moveXp != moveXe + move || moveYe != moveYp)
						this.moveXe += e.CheckMove(this.movement, "RIGHT", grid);
				}
				
				//PRESS F too attack with the red dolphin
				if (Keyboard.getEventKeyState()) {
					if (Keyboard.getEventKey() == Keyboard.KEY_F) 
					{
						if(p.posX - e.posX <= 128 && p.posX - e.posX >= -128 && e.isAlive)
						{
						p.health -= 1;
						}
					}
				}
				
				//PRESS M too attack with the blue dolphin
				if (Keyboard.getEventKeyState()) {
					if (Keyboard.getEventKey() == Keyboard.KEY_M) 
					{
						if(p.posX - e.posX <= 128 && p.posX - e.posX >= -128 && p.isAlive)
						{
						e.health -= 1;
						}
					}
				}
			}
			if(e.health <= 0)
			{
				e.isAlive = false;   //red dolphin is dead
			}
			if(p.health <= 0)
			{
				p.isAlive = false;   //blue  dolphin is dead
			}
			
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
