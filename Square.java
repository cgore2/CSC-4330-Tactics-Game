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
	 * @param y, the y-coordinate for the square
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

        /**
        * extracts float x value.
        * @return float x (x coordinate)
        */
	public float getX() {
		return x;
	}

	/**
         * x coordinate to replace/ assign this x
	 * @param x (float x coordinate)
	 */
	public void setX(float x) {
		this.x = x;
	}

        /**
         * extracts float y value
         * @return y (float y coordinate)
         */
	public float getY() {
		return y;
	}

	/**
         * to replace/ assign this y(coordinate)
	 * @param y, (float y coordinate) 
	 */
	public void setY(float y) {
		this.y = y;
	}

        /**
         * extracts float w value
         * @return float w (width)
         */
	public float getW() {
		return w;
	}

        /**
         * coordinate to replace/ assign this w 
         * @param w, (width,float)
         */
	public void setW(float w) {
		this.w = w;
	}

         /**
         * extracts float h value
         * @return float h (height,float)
         */
	public float getH() {
		return h;
	}

        /**
         * to replace/ assign  h(height)
         * @param h (height, float)
         */
	public void setH(float h) {
		this.h = h;
	}

        /**
         * this gets the Texture
         * @return texture
         */
	public Texture getTexture() {
		return texture;
	}

        /**
         * this replaces/assigns the Texture texture 
         * @param texture (texture)
         */
	public void setTexture(Texture texture) {
		this.texture = texture;
	}

        /**
         * This will set/replace the SqType 
         * @param type SqType
         */
	public void setType(SqType type) {
		this.type = type;
	}
	
}
