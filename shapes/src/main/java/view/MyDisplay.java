package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.MouseController;
import model.Circle;
import model.LigneBrisee;
import model.Point;
import model.Ring;
import model.Shape;
import model.World;

public class MyDisplay extends JPanel implements Observer{

	private World world;
	
	public MyDisplay(World w) {
		this.world = w;
		this.world.addObserver(this);
				
	}

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;      
		for(Shape s: world.getList()) {	
			s.draw(g2);
		}
    }

	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avance - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		World world = new World();
		
    	LigneBrisee lb = new LigneBrisee();
    	Point p1=new Point(0,200);
    	Point p2=new Point(200,300);
    	Point p3=new Point(100,200);
    	lb.add(p1);
    	lb.add(p2);
    	lb.add(p3);
    	world.add(lb);
		
    	Point p=new Point(100,100);
		Shape c = new Circle(p,20);
		world.add(c);
		
		Point p4=new Point(200,100);
		Ring r = new Ring(p4, 100, 50);
		world.add(r);
		
		
		MyDisplay d = new MyDisplay(world);
		d.getWorld().addObserver(d);
		MouseController mc = new MouseController(d);
		d.addMouseMotionListener(mc);
		frame.add(d);


	}


	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		Graphics g = this.getGraphics();    
		for(Shape s: world.getList()) {	
			s.draw(g);
		}
		
	}
	
	public World getWorld() {
		return world;

	}


}
