package com.durga;
// with constructor in abstract class

abstract class Person2 {             //-> assume 100 properties
    String name;
    int age;
    String district;
    String state;
    Person2(){

    }
    Person2(String name, int age, String district, String state) {
        this.name = name;
        this.age = age;
        this.district = district;
        this.state = state;
    }
}
//-> assume 1000 child classes
class Student472 extends Person2 {
    int rollno;
    int marks;
    Student472 (String name, int age, String district, String state, int rollno, int marks) {
//        super();
        super(name, age, district, state);          // super make things easy by minimizing initialization codes.
        this.rollno = rollno;
        this.marks = marks;
    }
}
class Teacher2 extends Person2 {
    double salary;
    String subject;
    Teacher2(String name, int age, String district, String state, double salary, String subject) {
        super(name, age, district, state);
        this.salary = salary;
        this.subject = subject;
    }
}

public class DS_47_constructor_abstract_class2 {
    public static void main(String[] args) {
        Student472 s = new Student472("Samir", 27, "Aligarh", "UP", 30, 60);
        System.out.println(s.name);
    }
}
