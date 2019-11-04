package fr.dauphine.ja.urrehmansania.shapes;

import java.util.ArrayList;
import java.util.LinkedList;

public class LigneBrisee {
	
	private LinkedList<Point> lk;
	
	public 	LigneBrisee() {
		lk = new LinkedList<Point>();
	}
	
	private void add(Point p) {
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

}
