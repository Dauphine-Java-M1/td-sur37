package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.LinkedList;

import view.Drawable;
import view.DrawableCircle;
import view.DrawableLine;

public class LigneBrisee extends Shape{
	
	private LinkedList<Point> lk;
	
	public 	LigneBrisee() {
		lk = new LinkedList<Point>();
	}
	
	public void add(Point p) {
		lk.add(p);
	}
	
	public int nbPoints() {
		return lk.size();
	}
	
	public boolean contains(Point p) {
		if(lk.contains(p)) {
			return true;
	    }
		else {
			return false;
		}
	}
	
	public LinkedList<Point> getPoints(){
		return lk;
	}
	
	
    public static void main( String[] args ){

    	
    	LigneBrisee lb = new LigneBrisee();
    	Point p1=new Point(1,2);
    	Point p2=new Point(3,5);
    	Point p3=new Point(1,2);
    	lb.add(p1);
    	lb.add(p2);
    	System.out.println(lb.nbPoints());
    	System.out.println(lb.contains(p1));

    }

	@Override
	public void draw(Graphics g2) {
		// TODO Auto-generated method stub
		Drawable dc=new DrawableLine(this);
		dc.paintComponent(g2);
		
	}

	@Override
	public void translate(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
