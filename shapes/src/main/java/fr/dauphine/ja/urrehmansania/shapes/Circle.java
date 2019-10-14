package fr.dauphine.ja.urrehmansania.shapes;

import java.util.ArrayList;

public class Circle {

	private Point centre;
	private int rayon;
	
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

	
	public String toString() {
		return "cercle de centre:" + centre + " rayon:" + rayon + " surface:" + surface() +"\n";
	}
	

	
    public static void main( String[] args ){
    	Point p=new Point(1,2);
    	Circle c=new Circle(p,1);
    	Circle c2=new Circle(p,2);
    	c2.translate(1,1);
    	System.out.println(c+" "+c2);
    	Point p2=new Point(5,4);
    	System.out.println(c.contains(p2));
    }
	
}
