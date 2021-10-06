package fr.dauphine.javaavance.td1;
import java.util.Iterator;
import java.util.LinkedList;



public class PolyLine {
	
	LinkedList<Point> list ;
	
	public PolyLine() {
		this.list = new LinkedList<Point>(); // aumatiquement, chaque polyline cree devient une linked list
	}
	
	public void add(Point p){
		this.list.add(p);
	}

	public int nbPoints() {
		return this.list.size();
	}
	
	
	public boolean contains(Point p) {
		return this.list.contains(p);
	}
	
	public void display() {
		Iterator<Point> iterator = this.list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		
		PolyLine polyline = new PolyLine();
		Point p = new Point(6,8);
		Point p2 = new Point(2,4);
		polyline.add(p);
		System.out.println(polyline.nbPoints());
		System.out.println(polyline.contains(p));
		System.out.println(polyline.contains(p2));
		polyline.add(p2);
		System.out.println(polyline.contains(p2));
		polyline.display();
		
	}

}