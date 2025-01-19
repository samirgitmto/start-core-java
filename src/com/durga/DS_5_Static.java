package com.durga;

//public class DS_5_Static {  //bcoz inner classes can't have static fields.
/*  *** instance method vs static method
-> Inside method implementation if we are using at least one instance variable, then that method
 talks about a particular object;  hence we should identify method as an Instance method.
-> Inside method implementation, if we are not using any instance variable, then this method is
 nowhere related to a particular object; hence we have to declare such method as static object irrespective of whether we are using static variables or not.
 */
class Student {
    String studname;
    int rollno;
    int marks;
    static String colname;

    String getStudentInfo () {   // instance method: uses 1 instance variable
        return studname;
    }
    static String getCollege () {        // static method: 0 instance variable
        return colname;
    }
    static int getAverage (int x, int y) {      // static method: 0 instance variable
        return (x+y)/2;                           //simple utility method
    }
/*    for static methods, implementation should be available
    whereas for abstract methods, implementation is not available.
    Hence abstract static combination is illegal for methods.
*/
}

