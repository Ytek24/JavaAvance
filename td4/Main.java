package fr.dauphine.javaavance.td4;

public class Main {

    public static void main(String[] args) {
        MyList m = new MyList();

        m.addLast("abc");
        m.add("def");
        m.addLast("ghi");
        System.out.println(m.toString());

        System.out.println(m.size());
        System.out.println("Sumletters : " + m.sumLetters());
    }

}