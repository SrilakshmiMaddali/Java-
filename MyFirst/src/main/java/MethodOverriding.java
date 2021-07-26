/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class MethodOverriding {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        
    }
    
}

class B{//Method Overriding,Late binding, Dynamic binding, Runtime Polymorphism
    public void show(){
        System.out.println("Hello from Super class");
    }

}
class C extends A{
    public void show(){
        System.out.println("Hello from sub class");
    }    

}