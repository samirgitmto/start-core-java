package com.durga;

public class DS_51_data_hiding {
//    *** CASE I - DATA HIDING
    // outside person can't access our internal data directly, or our internal data shouldn't go out directly
    // this oops feature is nothing but data hiding. After validation/authentication only, outside person can access our internal data.
//    e.g. after providing proper username & password, we can be able to access our gmail inbox.
//    even though we are valid customer of the bank, we can be able to access our account information only and we can't acces other's account information.

//-> by declaring data members(variables) as private, we can achieve data hiding.

    private double balance;

    public double getBalance() {
        //validation: if this person is valid, then only return the bank balance.
        return balance;
    }
//    -> the main advantage of data hiding is security.
//    recommended modifier to declare data members(variables) as private.

/*   *** Abstraction
-> hiding internal implementation and just highlight the set of services what we are offering, is a concept of abstraction.
e.g. ATM;through ATM gui screen, bank people are highlighting the set of services what they are offering without highlighting internal implementation.
Main advantages of Abstraction:
-> main advantage is security as we are not highlighting our internal implementation.
-> easier enhancement. e.g. suppose java is used in ATM and it is to be replaced with an enhanced language like MAVA, then we can implement it without really affecting the end users.
-> improves easiness to use.
-> maintainability
by using interfaces & abstract classes, we can implement abstraction.


  *** Encapsulation

*/
}
