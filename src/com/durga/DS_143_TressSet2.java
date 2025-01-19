package com.durga;
import java.util.Comparator;
import java.util.TreeSet;

public class DS_143_TressSet2 {
    public static void main(String[] args) {
//program to insert integer objects into the TreeSet where the sorting order is descending order.
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);  // [20, 15, 10, 5, 0]
    }
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;    // the first element
// 1. manual method
//        if (I1 < I2) {
//            return +1;    // means the next node for I1
//        }
//        else if (I1 > I2) {
//            return -1;    // means the previous node
//        }
//        else {
//            return 0;     // not inserted as duplicates not allowed
//        }

// 2. using compareTo()
//        return I1.compareTo(I2);  //default natural sorting order [0, 5, 10, 15, 20]
        return -I1.compareTo(I2);   // [20, 15, 10, 5, 0]
    }
}
