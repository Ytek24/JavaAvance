package fr.dauphine.ja.tekayayoussef.shapes.model;



import java.awt.Graphics2D;


public abstract class Dessin {

    private double x, y, radius;
    /*
     * public Dessin(double x, double y, double radius) { super(x, y, radius,
     * radius); this.x = x; this.y = y; this.radius = radius; }
     */

    public Dessin(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public abstract void dessiner(Graphics2D g);

    public abstract boolean contains(Point point);

    public abstract double getRadius();

}
