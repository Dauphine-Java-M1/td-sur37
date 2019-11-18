package model;

import java.awt.Graphics;
import java.awt.Graphics2D;

import view.Drawable;
import view.DrawableCircle;
import view.DrawableRing;

public class Ring extends Circle{
	
	private int internRayon;
	
	public Ring(Point centre, int rayon, int internRayon) {
		
		super(centre, rayon);
		this.internRayon = internRayon;		
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ring other = (Ring) obj;
		if (centre == null) {
			if (other.centre != null)
				return false;
		} else if (!centre.equals(other.centre))
			return false;
		if (internRayon != other.internRayon)
			return false;
		if (rayon != other.rayon)
			return false;
		return true;
	}
	
	@Override
	public float surface() {
		return (float)Math.PI * rayon * rayon - (float)Math.PI * internRayon * internRayon;
	}
	
	
	@Override
	public String toString() {
		//return "cercle de centre:" + centre + " rayon:" + rayon + " rayon interne:" + internRayon + " surface:" + surface() +"\n";
		return super.toString() + " rayon interne:" + internRayon ;
	}
	
	
	@Override
	public boolean contains(Point p) {
		if( super.contains(p) && (Math.pow(p.getX()-centre.getX(),2) + Math.pow(p.getY()-centre.getY(), 2)> Math.pow(internRayon,2))  ) {
			return true;
		}
		else {
			return false;
		}
	}
	

	public static boolean contains(Point p, Ring... rings) {
		for(Ring r:rings) {
			if(  r.contains(p) ) {
				return true;
			}
		}
		return false;
	}
	
	public int getInternRayon() {
		return internRayon;
	}
	
	
	public static void main( String[] args ) {
    	Point p=new Point(1,2);
		Ring r = new Ring(p, 15, 1);
		Ring r2 = new Ring(p, 4, 3);
		System.out.println(r);
    	Point p2=new Point(3,4);    	
    	System.out.println(r2.contains(p2));
    	System.out.println(Ring.contains(p2, r, r2));
				
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Drawable dc=new DrawableRing(this);
		dc.paintComponent(g);
	}
	

}
