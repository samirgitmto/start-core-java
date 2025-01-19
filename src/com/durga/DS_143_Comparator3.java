package com.durga;
import java.util.Comparator;
import java.util.TreeSet;

public class DS_143_Comparator3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator3());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
//        System.out.println(t);       // RE using compareTo method
// typecasting demo to insert (non-comparable) StringBuffer objects into the TreeSet where the sorting order is alphabetical order
        System.out.println(t);      // [A, K, L, Z]
    }
}
class MyComparator3 implements Comparator {
    public int compare(Object obj1, Object obj2) {
// typecasting can be done by following method only
        String s1 = obj1.toString();  //Returns a string representation of the object.
        String s2 = obj2.toString();
        return s1.compareTo(s2);
    }
}

