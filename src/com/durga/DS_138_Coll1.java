package com.durga;

import java.io.Serializable;
import java.util.*;

public class DS_138_Coll1 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        LinkedList l2 = new LinkedList();
        System.out.println(l1 instanceof Serializable);    // true
        System.out.println(l2 instanceof Cloneable);       // true
        System.out.println(l1 instanceof RandomAccess);    // true
        System.out.println(l2 instanceof RandomAccess);    // false

        ArrayList l = new ArrayList();         // non - synchronized 'l'
        List lsy = Collections.synchronizedList(l);    // synchronized 'lsy'

//        public static Set synchronizedSet(Set s)
//        public static Map synchronizedMap(Set m)


    }
}
