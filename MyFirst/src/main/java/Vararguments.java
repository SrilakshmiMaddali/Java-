/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class Vararguments {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(5);
        obj.show(5,7,8,9);
    }
    
}

class Display{
    public  void show(int a){
        //this method is executed if the number o arguments is 1 as it matches the number o arguments in the calling method.
            System.out.println(a+" one argument");
    }
    
    public void show(int ... a){ 
//... represent varargs that is variable number of arguments.It always checks for method signature first and then execute the method based on the number of arguments. 
        for(int i:a)
            System.out.println(i);
    
    }
                 
    
}