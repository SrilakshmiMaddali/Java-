/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Polymorphism
 *
 * @author srilakshmimaddali
 */
public class MethodOverloading {
    public static void main(String[] args) {
        P obj = new P();
        obj.show(4);
            
    }
    
}

class P{ //Method Overloading,Early Binding,Static Binding,Compile time Polymorphism
    public void show(){
        System.out.println("Hello");
    }
    public void show(int i){
        System.out.println("Hello "+i);
    }
}
