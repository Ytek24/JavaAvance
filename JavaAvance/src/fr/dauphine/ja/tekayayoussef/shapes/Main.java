package fr.dauphine.ja.tekayayoussef.shapes;

import java.awt.Dimension;

import javax.swing.JFrame;

import fr.dauphine.ja.tekayayoussef.shapes.model.Model;
import fr.dauphine.ja.tekayayoussef.shapes.controller.*;



public class Main {

    public static void main(String[] args) {
        Model m = new Model();
        MyDisplay myDisplay = new MyDisplay(m);

        Controller c = new Controller(m, myDisplay);

        Circle c1 = new Circle(new Point(250, 300), 40);
        m.add(c1);

        System.out.println(m.get(0) + " démarrage");

        /*
         * Circle c2 = new Circle(new Point(120, 700), 80);
         * 
         * Ring r = new Ring(c2, 20); m.add(c2); m.add(r);
         */

    }

}
