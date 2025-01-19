package com.durga;

class Student44 {
    String name;
    int rollno;
    Student44(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}  // 2. Constructors in parent & child classes
// Whenever we are creating child class object, automatically parent class constructor will be called to initialize instance variables coming from parent class.
// When parent class constructor gets executed, it does not mean that parent class object was created.
class ChildStudent extends Student44 {
    String guardian;
    int age;
    ChildStudent(String name, int rollno, String guardian, int age) {
        super(name, rollno);
        this.guardian = guardian;
        this.age = age;
    }
}

public class DS_44_new_vs_constructor {
    /* 1.Roles of new keyword and Constructor
     -> The main objective of 'new' operator is to create an object.
     -> The main purpose of constructor is to initialize an object.
     First object will be created using 'new', and then initialization will be performed by constructor.
     */
    public static void main(String[] args) {
        Student44 s = new Student44("Samir", 30);
        ChildStudent cs = new ChildStudent("Shimal", 35, "Niyaz", 12);
        System.out.println(cs.name + " " + cs.guardian + " " + cs.age);
/*
In the 2 program, both parent & child constructors executed for Child class object initialization only.
 */
    }
}
