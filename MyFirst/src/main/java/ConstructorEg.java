/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class ConstructorEg {

    public static void main(String[] args) {
        Abc obj = new Abc(7,5.5);

    }

}

class Abc {

    public Abc() {
        System.out.println("Default Constructor ");
    }

    public Abc(int i) {
        System.out.println("Overlaoding using int");
    }

    public Abc(int j, double d) {
        System.out.println("Overloaded again");
    }

}
