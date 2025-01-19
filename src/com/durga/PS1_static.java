package com.durga;

class StudentPS {
    String name;
    int rollno;
    static String college = "IPS";
//    static String college() {
//        return "IPS";
//    }
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }

    StudentPS (String n, int r) {
        this.name = n;
        this.rollno = r;
    }

    void getStudentPSinfo() {
        System.out.println(name + " " + rollno + " " + college);
    }
}

public class PS1_static {
    public static void main(String[] args) {
        StudentPS s1 = new StudentPS("Samir", 101);
        s1.getStudentPSinfo();
    }
}
