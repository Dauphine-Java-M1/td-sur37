package model;

import java.awt.Graphics;
import java.awt.Graphics2D;

import view.Drawable;

public abstract class Shape {

	private Point centre;

	public abstract void draw(Graphics g) ;
	
	public abstract void translate(int x, int y);
	
}
