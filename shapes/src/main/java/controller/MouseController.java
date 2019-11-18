package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import model.Shape;
import view.MyDisplay;

public class MouseController implements MouseMotionListener {
	
	private MyDisplay md;
	
	private int x;
	  
	private int y;
	
	public MouseController(MyDisplay md) {
		this.md = md;
	}
	

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse is being moved at location (" + e.getX() + ", " + e.getY() + ")");
		for(Shape s: md.getWorld().getList()) {	
			s.translate(e.getX(), e.getY());
			System.out.println(s.toString());
		}
	
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouse is being moved at location (" + e.getX() + ", " + e.getY() + ")");
		
	}

}
