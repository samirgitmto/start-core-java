package com.durga;
import java.util.LinkedList;

public class DS_140_Coll_LinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Samir");
        l.add(27);
        l.add(null);
        l.add("Durga Sir");
        System.out.println(l);          // [Samir, 27, null, Durga Sir]
        l.set(0, "Java");
        System.out.println(l);          // [Java, 27, null, Durga Sir]
        l.add(0, "Venky");
        System.out.println(l);          // [Venky, Java, 27, null, Durga Sir]
        l.removeLast();
        l.addFirst(0);
        System.out.println(l);          // [0, Venky, Java, 27, null]
    }
}
