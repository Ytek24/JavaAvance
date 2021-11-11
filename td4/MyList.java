package fr.dauphine.javaavance.td4;

public class MyList {

    private Cell first;
    private static int SIZE;

    public MyList(Cell first) {
        this.first = first;
    }

    public MyList() {
    }

    public void add(String s) {
        Cell newFirst = new Cell(s);
        Cell oldFirst = null;

        oldFirst = first;

        if (first != null)
            newFirst.setNext(oldFirst);

        first = newFirst;
        ++SIZE;
    }

    public int size() {
        /*
         * int taille = 0; Cell c = first; while (c != null) { ++taille; c =
         * c.getNext(); } return taille;
         */

        return SIZE;
    }

    public String toString() {
        Cell c = first;
        StringBuilder sb = new StringBuilder();
        while (c != null) {
            sb.append(c.getString() + ", ");
            c = c.getNext();
        }
        // s = s.substring(0, s.length() - 2);
        return sb.toString();
    }

    public void addLast(String s) {
        Cell nouv = new Cell(s);
        Cell last = null;

        if (first == null) {
            first = nouv;
            return;
        }

        last = first;

        while (last != null) {
            if (last.getNext() == null)
                break;
            last = last.getNext();

        }

        last.setNext(nouv);
        ++SIZE;
    }

    public void add(String s, int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();

        Cell c = first;

        for (int k = 0; k < size() && c != null; ++k) {
            if (k == i) {
                c.setNext(new Cell(s));
            }
            c = c.getNext();
        }
        ++SIZE;
    }

    public String get(int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();
        Cell c = first;

        for (int k = 0; k < size(); ++k) {
            c = c.getNext();
            if (i == k)
                return c.getString();
        }

        return "";
    }

    public int sumLetters() {
        int sum = 0;
        Cell c = first;

        while (c != null) {
            sum += c.getString().length();
            c = c.getNext();
        }

        return sum;
    }

}