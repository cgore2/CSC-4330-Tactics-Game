package data;

import static helpers.Painter.*;

import org.newdawn.slick.opengl.Texture;

public class Square {

	private float x, y, w, h;
	private Texture texture;
	private SqType type;
	
	/**
	 * Creates a Square and assigns it a texture
	 * 
	 * @param x, the x-coordinate for the square 
	 * @param y, the y-coordinate
	 * @param w. the width
	 * @param h, the height
	 * @param type, the Square type, which determines the texture of the Square
	 */
	public Square(float x, float y, float w, float h, SqType type){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.type = type;
		this.texture = LoadTexture(type.textName);
		
	}
	
	/**
	 *Draw function for drawing a Square 
	 */
	public void Draw(){
		DrawSqTex(texture, x, y, w, h);
	}

	public float getX() {
		return x;
	}

	/**
	 * @param x, x coordinate
	 */
	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	/**
	 * @param y, y coordinate
	 */
	public void setY(float y) {
		this.y = y;
	}

	public float getW() {
		return w;
	}

	public void setW(float w) {
		this.w = w;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public void setType(SqType type) {
		this.type = type;
	}
	
}
