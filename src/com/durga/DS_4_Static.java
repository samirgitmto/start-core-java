package com.durga;
// *** Method hiding ***
//public class DS_4_Static {
//  Case III: It seems overriding concept applicable for static methods, but
//   it is not Overriding. It is method hiding. {will be explained later in oops}
// for static methods, overloading & inheritance concepts are applicable. But overriding concepts are not applicable.
// Instead of overriding, method hiding concepts are applicable
class P1 {
    public static void main(String[] args) {
        System.out.println("parent main");
    }
}
                                              // method hiding
class C1 extends P1 {
    public static void main(String[] args) {
        System.out.println("Child main");       // run C1.main and get Child main
    }
}
public class DS_4_Static {
    public static void main(String[] args) {
//        P p = new P();
//        System.out.println(p);
        C1 c = new C1();
        System.out.println(c);
    }
}
