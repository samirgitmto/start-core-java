package com.durga;

public class DS_2_Static {
    int x = 10;
                                  //We can access static members (variables/methods) directly from both instance & static area directly.
    static int y = 20;            // static variables gets available immediately. It can be accessed anywhere.

    public void meth1 () {        // instance method              // "meth1" is only termed as signature.
        int a = 500;        // Local variable: These variables are declared within a method but do not get any default value. requires initialization
                            // does not include any access modifiers such as private, public, protected, etc.

        System.out.println(x);
        System.out.println(y);    // YES
    }

    public static void meth2 () {   // static method                // "meth2" is only termed as signature.
//        System.out.println(x);  //We can't access instance members (variables/methods) directly from static area. Non-static field 'x' cannot be referenced from a static context.
        System.out.println(y);  // YES
    }

    public static void main(String[] args) {

    }
}
