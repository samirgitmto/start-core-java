package com.durga;
// without constructor in abstract class.
abstract class Person {             //-> assume 100 properties
    String name;
    int age;
    String district;
    String state;
}
//-> assume 1000 child classes
class Student47 extends Person {
    int rollno;
    int marks;
    Student47(String name, int age,String district, String state, int rollno, int marks) {
        this.name = name;                   // 1
        this.age = age;                     // 2
        this.district = district;
        this.state = state;
        this.rollno = rollno;
        this.marks = marks;
    }
}
class Teacher extends Person {
    double salary;
    String subject;
    Teacher(String name, int age, String district, String state, double salary, String subject) {
        this.name = name;                   // 1
        this.age = age;                     // 2  without constructor, this repetition will persist and visualize the codes for assumed situation above.
        this.district = district;
        this.state = state;
        this.salary = salary;
        this.subject = subject;
    }
}

public class DS_47_constructor_abstract_class {
    public static void main(String[] args) {
        Student47 s = new Student47("Samir", 27, "Aligarh", "UP", 30, 60);
        Teacher t = new Teacher("Durga Sir", 48, "XYZ", "TN", 25, "Java");
    }
}
