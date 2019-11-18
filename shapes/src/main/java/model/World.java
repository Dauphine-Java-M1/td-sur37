package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;


public class World extends Observable {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public void add(Shape s) {
		shapes.add(s);
		this.setChanged();
		this.notifyObservers();
	}
	
	public ArrayList<Shape> getList(){
		return shapes;
	}


}
