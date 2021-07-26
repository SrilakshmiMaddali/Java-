/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 *
 * Anonymous object
 * Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.
 * If you have to use an object only once, an anonymous object is a good approach. For example:
 *
 * 1. new Calculation();//anonymous object  
 *
 */
// to calculate actorial of a given number
class Calculation {

    void fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("factorial is "+factorial);  
    }

}

public class AnonymousObj {

    public static void main(String[] args) {
        new Calculation().fact(6);

    }

}
