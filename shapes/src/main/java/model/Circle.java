package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import view.Drawable;
import view.DrawableCircle;

public class Circle extends Shape {

	protected Point centre;
	protected int rayon;
	
	public Circle(Point centre, int rayon) {
		this.centre = centre;
		this.rayon = rayon;	
	}
	
	public void translate(int dx, int dy) {
		centre.translate(dx, dy);
	}
	
	public float surface() {
		return (float)Math.PI * rayon * rayon;
	}
	
	public boolean contains(Point p) {
		if(  Math.pow(p.getX()-centre.getX(),2) + Math.pow(p.getY()-centre.getY(), 2)  < Math.pow(rayon,2) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean contains(Point p, Circle... cercles) {
		for(Circle c:cercles) {
			if(  c.contains(p) ) {
				return true;
			}
		}
		return false;
	}
	

	
	public String toString() {
		return "cercle de centre:" + centre + " rayon:" + rayon + " surface:" + surface() 
		;
	}
	
	
	public int getRayon() {
		return rayon;
	}
	
	
	public Point getCentre(){
		return centre;
	}

	
    public static void main( String[] args ){
    	Point p=new Point(1,2);
    	Circle c=new Circle(p,1);
    	Circle c2=new Circle(p,2);
    	c2.translate(1,1);
    	System.out.println(c+" "+c2);
    	Point p2=new Point(3,4);
    	System.out.println(c.contains(p2));
    	System.out.println(Circle.contains(p2, c, c2));    	
    }

	@Override
	public void draw(Graphics g2) {
		// TODO Auto-generated method stub
		Drawable dc=new DrawableCircle(this);
		dc.paintComponent(g2);
	}
	
}
