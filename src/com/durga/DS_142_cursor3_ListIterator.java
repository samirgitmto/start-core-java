package com.durga;

import java.util.LinkedList;
import java.util.ListIterator;

public class DS_142_cursor3_ListIterator {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Karim Benzema");
        ll.add("Sadio M");
        ll.add("M Salah");
        System.out.println(ll);  //  [Karim Benzema, Sadio M, M Salah]
        ListIterator litr = ll.listIterator();
        while(litr.hasNext()) {
            String s = (String) litr.next();
            if(s.equals("M Salah")) {
                litr.remove();
            }               // [Karim Benzema, Sadio M]
            else if(s.equals("Sadio M")) {
                litr.add("Robert L");
            }               // [Karim Benzema, Sadio M, Robert L]
            else if(s.equals("Karim Benzema")) {
                litr.set("Karim Benzema - Ballon d'or22 winner");
            }
        }
        System.out.println(ll); //[Karim Benzema - Ballon d'or22 winner, Sadio M, Robert L]
    }
}
