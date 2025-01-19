package com.durga;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DS_142_HashSet {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        System.out.println(h.add("a"));         //true
        System.out.println(h.add("a")); //false as duplicates are not allowed
        h.add("A");
        h.add("y");
        h.add("B");
        h.add("C");
        h.add(0);
        h.add(null);
        h.add(10);
        h.add("z");              // insertion order not preserved
        System.out.println(h);   // [0, null, a, A, B, C, y, 10, z]

        LinkedHashSet lh = new LinkedHashSet();
        System.out.println(lh.add("a"));         //true
        System.out.println(lh.add("a")); //false as duplicates are not allowed
        lh.add("A");
        lh.add("y");
        lh.add("B");
        lh.add("C");
        lh.add(0);
        lh.add(null);
        lh.add(10);
        lh.add("z");              // insertion order preserved
        System.out.println(lh);   // [a, A, y, B, C, 0, null, 10, z]
    }
}
