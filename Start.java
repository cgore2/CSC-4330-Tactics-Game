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

	public void Move() throws InterruptedException {
		while (Keyboard.next()) {
			if (Keyboard.getEventKeyState()) {
				if (Keyboard.getEventKey() == Keyboard.KEY_UP) {
					int move = this.moveYp - p.CheckMove(this.movement, "UP", grid);
					if (moveXp != moveXe || moveYp - move != moveYe)
						this.moveYp -= p.CheckMove(this.movement, "UP", grid);
				}

				if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
					int move = p.CheckMove(this.movement, "LEFT", grid);
					if (moveXp - move != moveXe || moveYp != moveYe)
						this.moveXp -= p.CheckMove(this.movement, "LEFT", grid);

				}

				if (Keyboard.getEventKey() == Keyboard.KEY_DOWN) {
					int move = p.CheckMove(this.movement, "DOWN", grid);
					if (moveXp != moveXe || moveYp + move != moveYe)
						this.moveYp += p.CheckMove(this.movement, "DOWN", grid);
				}

				if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
					int move = p.CheckMove(this.movement, "RIGHT", grid);
					if (moveXp + move != moveXe || moveYp != moveYe)
						this.moveXp += move;
				}

				if (Keyboard.getEventKey() == Keyboard.KEY_W) {
					int move = e.CheckMove(this.movement, "UP", grid);
					if (moveXp != moveXe || moveYe - move != moveYp)
						this.moveYe -= e.CheckMove(this.movement, "UP", grid);
				}

				if (Keyboard.getEventKey() == Keyboard.KEY_A) {
					int move = e.CheckMove(this.movement, "LEFT", grid);
					if (moveXp != moveXe - move || moveYe != moveYp)
						this.moveXe -= e.CheckMove(this.movement, "LEFT", grid);
				}

				if (Keyboard.getEventKey() == Keyboard.KEY_S) {
					int move = e.CheckMove(this.movement, "DOWN", grid);
					if (moveXp != moveXe || moveYe + move != moveYp)
					{
						this.moveYe += e.CheckMove(this.movement, "DOWN", grid);
					}
					
				}

				if (Keyboard.getEventKey() == Keyboard.KEY_D) {
					int move = e.CheckMove(this.movement, "RIGHT", grid);
					if (moveXp != moveXe + move || moveYe != moveYp)
						this.moveXe += e.CheckMove(this.movement, "RIGHT", grid);
				}
				
				if (Keyboard.getEventKeyState()) {
					if (Keyboard.getEventKey() == Keyboard.KEY_F) 
					{
						if(p.posX - e.posX <= 256 && p.posX - e.posX >= -256 && e.isAlive)
						{
						p.health -= 1;
						}
					}
				}
				
				if (Keyboard.getEventKeyState()) {
					if (Keyboard.getEventKey() == Keyboard.KEY_M) 
					{
						if(p.posX - e.posX <= 256 && p.posX - e.posX >= -256 && p.isAlive)
						{
						e.health -= 1;
						}
					}
				}
			}
			if(e.health <= 0)
			{
				e.isAlive = false;
			}
			if(p.health <= 0)
			{
				p.isAlive = false;
			}
			
		}

	}

	public void Attack() throws InterruptedException {
		while (Keyboard.next()) {
			if (Keyboard.getEventKeyState()) {
				if (Keyboard.getEventKey() == Keyboard.KEY_F) 
				{
					if(p.posX - e.posX <= 256 && p.posX - e.posX >= -256)
					{
					p.health -= 1;
					}
					System.out.println("TestbugF");
				}
			}
			
			if (Keyboard.getEventKeyState()) {
				if (Keyboard.getEventKey() == Keyboard.KEY_M) 
				{
					System.out.println("TestbugM");
					if(p.posX - e.posX <= 256 || p.posX - e.posX >= -256)
					{
					e.health -= 1;
					}
				}
			}
		}
		if(e.health <= 0)
		{
			e.isAlive = false;
		}
		if(p.health <= 0)
		{
			p.isAlive = false;
		}
	}

	public Start() throws InterruptedException {

		BeginSession();

		int[][] map = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 4, 14 },
			        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 11, 14 }, // 5 NW   6NE   7SW  8SE    
			        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14 }, //9 N 10W 11S 12E
			        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14 }, 
			        	{ 0, 0, 0, 0, 0, 0, 0, 5, 6, 0, 0, 0, 0, 0, 14 },
			        	{ 0, 0, 0, 0, 0, 0, 0, 7, 8, 0, 0, 0, 0, 0, 14 }, 
			        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14 },
			        	{ 0, 0, 0, 0, 0, 5, 6, 0, 0, 0, 0, 0, 0, 0, 14 },
			        	{ 0, 0, 0, 0, 0, 10, 12, 0, 0, 0, 0, 0, 0, 0, 14 },
			        	{ 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 1 } };

		this.moveXp = 0;
		this.moveYp = 64;
		this.moveXe = 832;
		this.moveYe = 512;
		this.movement = 64;
		int hp = 5;
		int he = 5;
		SqGrid grid = new SqGrid(map);
		Player p1 = new Player(grid.getStartX(), grid.getStartY(), hp);
		Player p2 = new Player(grid.getStartX(), grid.getStartY(), he);
		this.grid = grid;
		this.p = p1;
		this.e = p2;

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
			//Attack();
			if (!entered) {
				DrawMenu(896,576);
				entered = true;
			}
			Display.update();
			Display.sync(60);
		}

		Display.destroy();
	}

	public static void main(String[] args) throws InterruptedException {
		new Start();
	}

}
