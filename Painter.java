package helpers;

import static org.lwjgl.opengl.GL11.*;

import java.io.IOException;
import java.io.InputStream;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Painter {

	public static final float WIDTH = 960, HEIGHT = 640;
	
	public static void BeginSession(){
		Display.setTitle("Sub-Dolphin Machine Cannon");
		try {
			Display.setDisplayMode(new DisplayMode(960, 640));
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, WIDTH, HEIGHT, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
	
	}
	
	public static void DrawSq(float x, float y, float w, float h){
		glBegin(GL_QUADS);
		glVertex2f(x, y); //top left
		glVertex2f(x + w, y); //top right
		glVertex2f(x + w, y + h); // bot right
		glVertex2f(x, y + h); //bot left
		glEnd();
	}
	
	public static void DrawSqTex(Texture tex, float x, float y, float w, float h){
		tex.bind();
		glTranslatef(x, y, 0);
		glBegin(GL_QUADS);
		glTexCoord2f(0,0);
		glVertex2f(0,0);
		glTexCoord2f(1,0);
		glVertex2f(w,0);
		glTexCoord2f(1,1);
		glVertex2f(w,h);
		glTexCoord2f(0,1);
		glVertex2f(0,h);
		glEnd();
		glLoadIdentity();
	}
	
	
	public static void DrawMenu(float w, float h)
	{
		Texture menu = LoadTexture("MenuSDMC");
		menu.bind();
		glTranslatef(960,640,0);
		glBegin(GL_QUADS);
		glTexCoord2f(0,0);
		glVertex2f(0,0);
		glTexCoord2f(1,0);
		glVertex2f(w,0);
		glTexCoord2f(1,1);
		glVertex2f(w,h);
		glTexCoord2f(0,1);
		glVertex2f(0,h);
		glEnd();
		glLoadIdentity();
	}
	
	
	public static Texture LongLoadTexture(String path, String type){
		Texture tex = null;
		InputStream in = ResourceLoader.getResourceAsStream(path);
		try {
			tex = TextureLoader.getTexture(type, in);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return tex;
		
	}
	
	public static Texture LoadTexture(String name){
		Texture tex = null;
		tex = LongLoadTexture("res/"+name+".png", "PNG");
		return tex;
	}	
}
