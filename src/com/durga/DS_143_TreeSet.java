package com.durga;

import java.util.TreeSet;

public class DS_143_TreeSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        System.out.println(t.add("a"));         //true
        System.out.println(t.add("a")); //false as duplicates are not allowed
        t.add("A");
        t.add("y");
        t.add("B");
        t.add("C");
//        t.add(0);          // ClassCastException
//        t.add(null);       // NullPointerException
        t.add("z");        // default natural sorting order based on unicode
        System.out.println(t);   // [A, B, C, a, y, z]

        System.out.println("A".compareTo("Z"));     // -25
        System.out.println("A".compareTo("Y"));     // -24
        System.out.println("E".compareTo("A"));     // +4
        System.out.println("A".compareTo("A"));     // 0
//        System.out.println("E".compareTo(null)); //NullPointerException


    }
}
