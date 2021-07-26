/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
interface Abcdinter{
    void show();
}
class Abcimpl implements Abcdinter{
    public void show(){
        System.out.println("In show");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Abcdinter obj = new Abcimpl();
        obj.show();
        
        
    }
}
