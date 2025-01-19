package com.durga;
import java.util.Vector;

public class DS_140_Vector {
    public static void main(String[] args) {
//        add(Object o)              ----Collection method
//        add(int index, Object o)   ----List method
//        addElement(Object o)       ----Vector method
//        remove(Object o)             ----C
//        remove(int index)            ----L
//        removeElement(Object o)      ----V
//        removeElementAt(int index)   ----V
//        clear()                      ----C
//        removeAllElements()          ----V
//        Object get(int index)          ----L
//        Object elementAt(int index)    ----V
//        Object firstElement()          ----V
//        Object lastElement()           ----V
//        int size()
//        int capacity()
//        Enumeration elements()

        Vector v = new Vector();
        System.out.println(v.capacity());
        System.out.println(v.size());  // size refers to the occupied places/ number of objects
        v.addElement(1);
        System.out.println(v.size());  // size = 1; as only 1 object 10 has been added in v
        for(int i=2; i<=10; i++) {
            v.addElement(i);
        }

        System.out.println(v);        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        v.addElement("SA");       // String added
        v.addElement('A');        // Char added
        // Automatic double increment of capacity
        System.out.println("New capacity after automatic increment = " + v.capacity());
        System.out.println(v);        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, SA, A]
    }
}
