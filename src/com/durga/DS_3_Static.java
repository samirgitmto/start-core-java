package com.durga;

public class DS_3_Static {
    // Case I: Overloading concepts applicable for static methods including main method.
    public static void main(String[] args) {       // main method
        System.out.println("String[]");
    }

    public static void main(int[] args) {         // method overloading: same name with different arguments
        System.out.println("int[]");               // normal method
    }
}
//O/P JVM will call the String[] as the main method only & int[] will act as a normal method.
//    Also because the JVM is designed so.

//  Case II: Inheritance concepts applicable for static methods including main method.
//    Hence, while executing child class, if child class does not contain main method,
//    then parent class main method will be executed.
//class P {
//    public static void main(String[] args) {
//        System.out.println("parent main");
//    }
//}
//class C extends P {
//
//}
//public class DS_3_Static {
//    public static void main(String[] args) {
////        P p = new P();
////        System.out.println(p);
//        C c = new C();
//        System.out.println(c);
//    }
//}      for case III, go to next java file.
