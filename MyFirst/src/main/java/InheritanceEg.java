/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Single level inheritance
 * @author srilakshmimaddali
 */
public class InheritanceEg {
    public static void main(String[] args) {
        AddSub obj1 = new AddSub();
        obj1.num1 =10;
        obj1.num2 = 4;
        obj1.sum();
        System.out.println("Addition "+ obj1.result);
        obj1.sub();
        System.out.println("Subtraction is "+obj1.result);
        
    }
    
}

class Addition{
    int num1,num2,result;
    public void sum(){
        result = num1+num2;
    }
}
class AddSub extends Addition{//Single level Inheritance
    public void sub(){
        result= num1-num2;
    }

}

class AddSubMul extends AddSub{//Multilevel Inheritance
    public void Multi(){
        result = num1*num2;
    }

}