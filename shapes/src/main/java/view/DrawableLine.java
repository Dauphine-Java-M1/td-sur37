package view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import model.LigneBrisee;
import model.Point;
import model.Shape;

public class DrawableLine extends Drawable {
	
	LigneBrisee s;
	
    public DrawableLine(Shape s) {
		this.s=(LigneBrisee) s;
		
	}

	public void paintComponent(Graphics2D g2) {
		int i = 0;
		while(i<s.nbPoints()-1){
			g2.drawLine(s.getPoints().get(i).getX(), s.getPoints().get(i).getY(), s.getPoints().get(i+1).getX(), s.getPoints().get(i+1).getY());;
			i++;
		}

    }
}
