package fr.dauphine.ja.tekayayoussef.shapes.model;

import fr.dauphine.javaavance.td1.Point;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle(fr.dauphine.ja.tekayayoussef.shapes.model.Point point, int radius) {
		this.center= new Point(point.getX(),point.getY());
		this.radius=radius;
	}
	
	public Point getCenter() {
		return new Point(center);
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void translate(int dx, int dy) {
		Point copy_point = new Point(this.center.getX(),this.center.getY());
		this.center.setX(copy_point.getX()+dx);
		this.center.setY(copy_point.getY()+dy);
	}
	public boolean contains(Point p) {
		boolean res = false;
		double resCalculX = Math.pow((p.getX()-this.center.getX()), 2);
		double resCalculY = Math.pow((p.getY()-this.center.getY()), 2);
		
		if(Math.sqrt(resCalculX+resCalculY)<this.radius) {
			res = true;
		}
		return res;
	}
	
	public double area() {
		double PI=3.14159;
		double result=PI*this.getRadius()*this.getRadius();
		return result;
	}
	public static void main(String[] args) {
		Point p = new Point(1,2); 
		Circle c = new Circle(p,7);
		Circle c2 = new Circle(p,5);
		c2.translate(1,1);
		System.out.println(c);
		System.out.println(c2);	
		System.out.println(c2.contains(p));
	}
	

	public String toString() {
		String res = "Le rayon du cercle est de "+this.getRadius()+ " , Le centre du cercle est le point : "+this.center.displayPoint();
		res += " L'air du cercle est de "+this.area()+" cm^2";
		return res;
	}

}
