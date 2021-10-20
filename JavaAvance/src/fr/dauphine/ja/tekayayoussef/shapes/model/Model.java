package fr.dauphine.ja.tekayayoussef.shapes.model;

import java.util.LinkedList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Model extends Observable {

    private LinkedList<Dessin> forms;

    public Model() {
        forms = new LinkedList<Dessin>();
    }

    public Model(LinkedList<Dessin> forms) {
        this.forms = forms;
    }

    public void add(Dessin d) {
        forms.add(d);
        notifyObservers();
    }

    public void remove(Dessin d) {
        forms.remove(d);
        notifyObservers();
    }

    public Dessin get(int i) {
        return forms.get(i);
    }

    public int size() {
        return forms.size();
    }

}
