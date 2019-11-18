package view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import model.Circle;
import model.Shape;

public class DrawableCircle extends Drawable {
	
	Circle s;
	
    public DrawableCircle(Shape s) {
		this.s=(Circle) s;
		
	}

	public void paintComponent(Graphics2D g2) {

        g2.drawOval(s.getCentre().getX() - s.getRayon(), s.getCentre().getY()- s.getRayon(), s.getRayon()*2, s.getRayon()*2);
  
    }
	
}
