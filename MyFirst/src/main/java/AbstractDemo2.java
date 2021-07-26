/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class AbstractDemo2 {
    public static void main(String[] args) {
        Iphone obj = new Iphone();
        SamsungPhone obj1 = new SamsungPhone();
        show(obj1);
        
    }
    public static void show(Phone obj){
        obj.showConig();
    }
}

abstract class Phone{
    public abstract void showConig();

}

class Iphone extends Phone{
    public void showConig(){
        System.out.println("4gb,Ios 12");
        
    }    
}

class SamsungPhone extends Phone{

    @Override
    public void showConig() {
        System.out.println("4gb,Lolipop"); //To change body of generated methods, choose Tools | Templates.
    }


}