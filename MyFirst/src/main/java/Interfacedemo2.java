/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Types o interfaces
 * Marker Interface -> without any methods
 * SAM -> Single Abstract method or functional interface
 * Normal
 * 
 * @author srilakshmimaddali
 */
public class Interfacedemo2 {
    public static void main(String[] args) {
        pqr obj = new pqr(){//Writing class implementation inside the main method as it is just one method.
            public void show(){
                System.out.println("In main show");
            }
            
        };
        obj.show();
        
    }
    
}

interface pqr{
    void show();
}
