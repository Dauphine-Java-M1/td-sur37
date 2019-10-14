package fr.dauphine.ja.urrehmansania.shapes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point{
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean isSameAs(Point p1, Point p2){
		if(p1.x == p2.x && p1.y==p2.y){
			return true;
		}
		else {
			return false;	
		}		
	}
	
	public void translate(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	
    public static void main( String[] args ){
    	Point p1=new Point(1,2);
    	Point p2=p1;
    	Point p3=new Point(1,2);
       	System.out.println(p1);
    	ArrayList<Point> list = new ArrayList<Point>();
    	list.add(p1);
    	System.out.println(list.indexOf(p2));
    	System.out.println(list.indexOf(p3));
    }
}
