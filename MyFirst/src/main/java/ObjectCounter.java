/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 * To know the number of objects created from the class. By making the variable i as static it could retain the same value across multiple objects as its a class variable.
 */
public class ObjectCounter {

    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        obj3.showCounter();
    }

}

class A {

    static int i;

    public A() {
        i++;
    }

    public void showCounter() {
        System.out.println(i);
    }

}
