package com.durga;
import java.util.Comparator;
import java.util.TreeSet;

public class DS_143_Comparator2 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator2());
        t.add("Samir");
        t.add("Zameer");
        t.add("Aamir");
        t.add("Ali");
//        System.out.println(t); // [Aamir, Ali, Samir, Zameer] DNIO
        System.out.println(t);   // [Zameer, Samir, Ali, Aamir]
    }
}
class MyComparator2 implements Comparator {
    public int compare(Object obj1, Object obj2) {
        // typecasting can be done by either of below 2 ways
         String s1 = obj1.toString();
         String s2 = (String) obj2;
         return s2.compareTo(s1);
    }
}
