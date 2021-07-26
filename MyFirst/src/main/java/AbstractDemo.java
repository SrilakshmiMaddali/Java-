/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class AbstractDemo {

    public static void main(String[] args) {
        //MPhone obj =  new MPhone();//Cannot instantiate an abstract class

        BPhone obj = new BPhone();
        obj.call();
        obj.move();
        obj.cook();
        obj.make();
    }

}

abstract class MPhone { // Abstract class

    public void call() {
        System.out.println("Calling....");
    }

    abstract public void move();//Absract method

    abstract public void cook();//Absract method

    abstract public void make();//Absract method
}

abstract class SPhone extends MPhone {//Abstract class

    public void move() {
        System.out.println("Moving....");

    }

}

class BPhone extends SPhone {

    public void cook() {
        System.out.println("Cooking....");

    }

    public void make() {
        System.out.println("Making....");

    }

}
