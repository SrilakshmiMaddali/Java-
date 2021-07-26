/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *functional interface can be represented using a lambda Expression in single line as shown below
 * @author srilakshmimaddali
 */
interface pqr1{
    void show();
}

public class InterfacewithLambda {
    public static void main(String[] args) {
        pqr1 obj = ()-> System.out.println("In Main show");//Lambda Expression
        obj.show();
    }
    
}
