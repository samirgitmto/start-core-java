package com.durga;
import java.util.Comparator;
import java.util.TreeSet;

class MyComparator143 implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}

public class DS_143_comp5_scopeII {
    public static void main(String[] args) {
        Employee e1 = new Employee("Samir", 100);
        Employee e2 = new Employee("Aamir", 500);
        Employee e3 = new Employee("Zameer", 200);
        Employee e4 = new Employee("Durga", 400);
        Employee e5 = new Employee("Durga", 400);

        TreeSet t2 = new TreeSet(new MyComparator143());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);

        System.out.println(t2);
//        [Aamir--500, Durga--400, Samir--100, Zameer--200]
    }
}
