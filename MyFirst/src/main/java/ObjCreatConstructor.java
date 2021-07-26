/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class ObjCreatConstructor {
    public static void main(String[] args) {
        Abcd obj1 = new Abcd(4);
         Ab obj2 = new Abcd();//Reference of Super class and Object of sub class 
         //Abcd obj3 = new Ab(); not possible
    }
    
}
class Ab{
    public Ab(){
        System.out.println("In Constructor Ab");
    
    }
    public Ab(int i){
        System.out.println("In Constructor Ab int");
    
    }
    
}

class Abcd extends Ab{
    public Abcd(){
        //super();
        System.out.println("In Constructor Abcd");
    
    }
    public Abcd(int i){
        //super();
        System.out.println("In Constructor Abcd int");
    
    }
    
}
