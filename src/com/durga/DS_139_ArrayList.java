package com.durga;
import java.util.ArrayList;

public class DS_139_ArrayList {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Samir");
        l.add(27);
        l.add("Java");
        l.add("Durga Sir");
        System.out.println(l);        // [Samir, 27, Java, Durga Sir]

        l.set(2, "Java Developer");
        System.out.println(l);        // [Samir, 27, Java Developer, Durga Sir]

        l.remove(3);
        l.add(0, "Venky");
        System.out.println(l);        // [Venky, Samir, 27, Java Developer]

//        l.removeLast();            Cannot resolve method 'removeLast' in 'ArrayList'
//        l.addFirst(0);             Cannot resolve method 'addFirst' in 'ArrayList'
//        instead we can do it through index.
    }
}
