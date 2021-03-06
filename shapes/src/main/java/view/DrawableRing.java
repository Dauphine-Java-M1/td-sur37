package view;

import java.awt.Graphics2D;

import model.Ring;
import model.Shape;

public class DrawableRing extends Drawable{

	Ring s;
	
	public DrawableRing(Shape s) {
		this.s = (Ring) s;
	}

	public void paintComponent(Graphics2D g2) {

		g2.drawOval(s.getCentre().getX()- s.getRayon(), s.getCentre().getY() - s.getRayon(), s.getRayon()*2, s.getRayon()*2);
		g2.drawOval(s.getCentre().getX() - s.getInternRayon(), s.getCentre().getY() - s.getInternRayon(), s.getInternRayon()*2, s.getInternRayon()*2);
		  
    }
			
}
