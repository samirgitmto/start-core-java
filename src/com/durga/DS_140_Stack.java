package com.durga;

import java.util.Stack;

public class DS_140_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
//        Insertion order preserved:
        System.out.println(s);     // [A, B, C]
//  Last In First Out demo
        System.out.println(s.search("A"));      // Offset = 3
        System.out.println(s.search("B"));      // Offset = 2
        System.out.println(s.search("Z"));      // -1
        s.pop();        // top Object will be removed
        System.out.println(s);     // [A, B]
        System.out.println(s.capacity());
    }
}
