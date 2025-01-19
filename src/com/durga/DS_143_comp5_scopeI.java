package com.durga;
import java.util.TreeSet;

class Employee implements Comparable {
    String name;
    int eid;

    public Employee(String name, int eid) {     // constructor
        this.name = name;
        this.eid = eid;
    }
    public String toString() {
        return name + "--" + eid;
    }
    @Override
    public int compareTo(Object obj) {
        int eid1 = this.eid;
        Employee e = (Employee) obj;
        int eid2 = e.eid;

        if (eid1 < eid2) {
            return -1;
        }
        else if (eid1 > eid2) {
            return 1;
        }
        else return 0;
//        return Integer.compare(eid1, eid2);  // will give same result
    }
}

public class DS_143_comp5_scopeI {
    public static void main(String[] args) {
        Employee e1 = new Employee("Samir", 100);
        Employee e2 = new Employee("Aamir", 500);
        Employee e3 = new Employee("Zameer", 200);
        Employee e4 = new Employee("Durga", 400);
        Employee e5 = new Employee("Durga", 400);

        TreeSet t1 = new TreeSet();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);

        System.out.println(t1);
//        [Samir--100, Zameer--200, Durga--400, Aamir--500]
    }
}
