package fr.dauphine.javaavance.td4;

public class Cell {

    private String s;
    private Cell next;

    public Cell(String s) {
        this.s = s;
        this.next = null;
    }

    public String getString() {
        return s;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

}
