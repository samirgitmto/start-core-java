package com.durga;

import java.util.ArrayList;
import java.util.Iterator;

public class DS_141_cursor2_iterator {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        for(int i = 0; i<=10; i++) {
            l.add(i);
        }
        System.out.println(l);  //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// iterator obj by using iterator() method of Collection interface
        Iterator itr = l.iterator();
// iterator-specific methods to take each integer and do the required thing
        while(itr.hasNext()) {
            Integer I = (Integer)itr.next();
        // checking for even integers
            if(I % 2 == 0) {
                System.out.println(I);
            }
        // removing odd integers using iterator
            else {
                itr.remove();
            }
        }
        System.out.println(l);  //[0, 2, 4, 6, 8, 10]
    }
}
