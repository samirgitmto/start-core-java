package com.durga;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class DS_142_cursor4_imple {
    public static void main(String[] args) {
        Vector v = new Vector();

        Enumeration e = v.elements();
        Iterator ir = v.iterator();
        ListIterator ltr = v.listIterator();

        System.out.println(e.getClass().getName());   // java.util.Vector$1
        System.out.println(ir.getClass().getName());  // java.util.Vector$Itr
        System.out.println(ltr.getClass().getName()); // java.util.Vector$ListItr
    }
}
