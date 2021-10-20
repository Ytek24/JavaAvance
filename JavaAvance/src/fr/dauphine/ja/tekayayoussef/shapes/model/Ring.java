package fr.dauphine.ja.tekayayoussef.shapes.model;

public class Ring{
	private Circle circle;
	private int radiusInner;
	
	public Ring(Point p, int radius, int radiusInner) {
		if(radius > radiusInner) {
			this.circle = new Circle(p,radius);
			this.radiusInner = radiusInner;
		}
	}

	public static void main(String[] args) {
		Point p = new Point(2,1);
		Ring ring = new Ring(p,2,1);
		
	}
	public boolean equals(Ring r){
		Ring ring = r;
		if(this.circle==r.circle && this.radiusInner==r.radiusInner) {
			return true;
		}
		else
			return false;
	}
	
	public String toString() {

		return circle.toString()+" Radius interne :  "+this.radiusInner;
	}

	public boolean contains(Point p) {
		return (Math.pow(Math.sqrt(circle.getCenter().getX() - p.getX()), 2) + Math.pow(Math.sqrt(circle.getCenter().getY() - p.getY()), 2)) < Math.pow(radiusInner, 2);
	}
	
	public boolean contains(Point p, Ring...rings) {
		for(Ring r : rings)
			if(r.contains(p))
				return true;
		return false;
	}
	

}
