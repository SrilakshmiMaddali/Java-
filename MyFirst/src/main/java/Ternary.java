/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class Ternary {
    public static void main(String a[]){
        int i =5;
        int j;
        j=i==1?6:7;
        System.out.println(j);
        
        Object obj1;
        Object obj2;
        obj2 = obj1=true?new Integer(10):new Double(15.0);
        System.out.println(obj2);
                
        
    }
    
}
