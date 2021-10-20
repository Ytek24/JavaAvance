package fr.dauphine.ja.tekayayoussef.shapes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.tekayayoussef.shapes.model.Circle;
import fr.dauphine.ja.tekayayoussef.shapes.model.Model;
import fr.dauphine.ja.tekayayoussef.shapes.model.Point;

public class MyDisplay extends JPanel{

	@Override
	public void paintComponent(Graphics g) {
		g.drawLine(300,300,100,600);

	}
	 public static void main(String[] args) {
			
			JFrame frame = new JFrame("Java Avanc ́e - Graphic Display");
			frame.setSize(new Dimension(500,500));
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			MyDisplay d = new MyDisplay();
			frame.add(d);
	        Model m = new Model();
	        m.addObserver((Observer) d);

	        Circle c = new Circle(new Point(250, 300), 40);
	        m.add(c);

	        System.out.println(m.get(0));

	        frame.add(d);

	        Circle c2 = new Circle(new Point(120, 700), 80);

	        Ring r = new Ring(c2, 20);
	        m.add(c2);
	        m.add(r);
	    }

	    @Override
	    public void update(Observable o, Object arg) {
	        this.paintComponent(this.getGraphics());
	    }

	    public void reload() {
	        this.paintComponent(this.getGraphics());
	    }

	}

	
}
