package com.durga;
import java.util.Enumeration;
import java.util.Vector;

public class DS_140_Cursor1_Enumeration {
    public static void main(String[] args) {
        Vector v = new Vector();
//  Filling data into the vector, from 0 to 10
        for(int i=0; i<=10; i++) {
            v.addElement(i);
        }
//  Creating an Enumeration object by using elements method of Vector class
        Enumeration e = v.elements();
//  using enumeration to get objects one by one from legacy Collection object(Vector/Stack).
        while(e.hasMoreElements()) {
            Integer I = (Integer)e.nextElement();
//  Selecting & printing the even integers one by one
            if(I%2 == 0) {
                System.out.println(I);
            }
// Removing the odd integers
            else {
                System.out.println(I + " will be removed");
                v.remove(I);
                System.out.println(v);
            }
        }
//  Printing the final Vector object after removal
        System.out.println(v);   // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
