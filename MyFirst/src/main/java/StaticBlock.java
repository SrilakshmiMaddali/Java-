/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * static method will be called even before the main method is called. So if you want to assign anything before the main method is executed you can write that code in static block. 
 * you can have any number o static methods but the they will be executed in a sequence.
 * @author srilakshmimaddali
 */
public class StaticBlock {
    static String str ="";
    static
    {
        str ="Hello world";
    }
    public static void main(String[] args) {
        System.out.println("The string str is "+str);
    }
    
        static
    {
        str ="Hello my dear";
    }
    
}
