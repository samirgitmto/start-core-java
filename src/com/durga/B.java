package com.durga;

//public class DS_68_java_source_file_structure {
//}
class A {
    public static void main(String[] args) {
        System.out.println("A class main");
    }
}
class B {
    public static void main(String[] args) {
        System.out.println("B class main");
    }
}
class C {
    public static void main(String[] args) {
        System.out.println("C class main");
    }
}
class Student68 {                     //no import statement require: all classes are present in java.lang package. NOT true for its sub-package classes.
    public static void m1() {
        // All classes & interfaces present inside the current working directory (package) or location are available for our program by default
        System.out.println("Student 68 class static method");
    }
}
