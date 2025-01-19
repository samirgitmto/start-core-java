package com.durga;

public class DS_1_Static {      // static kw modifier is applicable for methods, variables and inner classes(static nested classes). NOT for top level classes.
/* There are tons of reserved keywords in Java that cannot be used as names of variables or identifiers. One such frequently used keyword in Java is the “Static” keyword.
 The most important reason why static keywords are heavily used in Java is to efficiently manage memory. Generally, if you want to access variables or methods inside a class,
  you first need to create an instance or object of that class. However, there might be situations where you want to access only a couple of methods or variables of a class and
  you don’t want to create a new instance for that class just for accessing these members. This is where you can use the static keyword in Java.
In Java, it is possible to use the static keyword with methods, blocks, variables, as well as nested classes. In simple words, if you use a static keyword with a variable or a method inside a class, then for every instance that you create for that class, these static members remain constant and you can’t change or modify them. In fact, you can access these members even without creating an instance of an object for those classes. You can access them simply using the class name. In fact, the main method of a class in Java usually has a static keyword associated with it. But, yes, it depends on the choice of the developer.
*/
    static int x = 10;        // static variable: for total class, only 1 copy will be created at class level and shared by every objects of that class.

    int y = 20;               // instance variable: for every object, a separate copy will be created. Instance variables are declared within a class but...
    int z;             //...outside a method, constructor, or block and always get a default value. does NOT necessarily require initialization. They are used to reserving
                       // memory for data that the class needs and that too for the lifetime of the object.

    public static void main(String[] args) {
        DS_1_Static ds = new DS_1_Static();
        ds.x = 888;               // this value 888 will replace x = 10 for every objects in the whole class
        ds.y = 999;               // this value 999 will replace y = 20 for this object only.
        System.out.println(ds.x);
        System.out.println(ds.y);
        System.out.println(ds.z);      // nothing assigned, so default value of 0 will be printed.

        DS_1_Static ds2 = new DS_1_Static();
        System.out.println(ds2.x);     // here we get the same value of 888 again for the static variable as only 1 copy is available which was modified in the previous object
        System.out.println(ds2.y);     // here we get the default value of y = 20, as it was assigned earlier.
    }
}
