package com.durga;

public class DS_6_main_method {
/*}    /* it can be compiled but can't run by JVM as no main methods exist.
-> Whether class contains main method or not, and whether main method is declared according to requirement or not, these things won't be checked by compiler.
->  At runtime, JVM is responsible to check these things. Before JVM unable to find main method, then we will get "runtime exception" saying NoSuchMethodError:Main
   */
    public static void main(String[] args) {
/* JVM always searches for this code named "main()" because JVM is configured so.
-> At runtime JVM always searches for the main method with the above prototype.
    public: to call by JVM from anywhere.
    static: without existing object also, JVM has to call this method.
    void: main() method won't return anything to JVM.
    main: this name is configured inside JVM.
    String[] args: Command line arguments
->The above syntax is very strict and if we perform any change, we will get runtime exception saying NoSuchMethodError:main.
-> Order of modifiers does not matter. Following modifications allowed:
 1. public static = static public
 2. We can declare String array in any acceptable form. e.g. main(String args[]); 'String' is a must
 3. Instead of args, we can take any valid JAVA identifiers. e.g. main(String[] xyz);
 4. We can replace String array with VarArgs parameter. i.e. main(String... args)
 5. We can declare main() with following modifiers:
         final
         synchronized
         strictfp
 -> Never gives "compile time error" but may give runtime exception.
 */
        System.out.println("String [] args");
    }

/*CaseI: Overloading of main method is possible but JVM will always call (String[] args) as the main method only.
The other overloaded method have to be called explicitly like a normal method call.

 */
    public static void main(int[] args) {        //Overloading of main method
        System.out.println("int[] args");
    }
/*Case II: Inheritance concept applicable for main method. Hence while executing child class,
if child doesn't have main method, then parent class main method will be executed.

Case III: Method hiding concept applicable: see DS_4_Static.java

-> for main(), Inheritance and Overloading concepts are applicable. But Overriding concept is not applicable.
Instead of Overriding, Method hiding concept is applicable.
*/
}
