package com.durga;

interface Interf {
    // every variable inside an interface is public, static & final
    int x = 10;
}
/*   That's why Constructor concept not applicable
-> Interfaces can have instance methods and static final variables.
-> Interfaces can't have instance variables, constructors and static methods (concrete methods with implementation not allowed).
-> if everything is abstract it is highly recommended to opt for interface rather than abstract class.
-> We can replace interface with abstract class but its not a good programming practice. this is something like hiring ias officer for sweeping purpose.
 */

public class DS_48_constructor_abstract_interface {
    public static void main(String[] args) {
        System.out.println(Interf.x);
    }
}
