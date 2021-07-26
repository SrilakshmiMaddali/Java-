/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
class Rectangle{

    int length,width;
    void insert(int i,int w){
        length = i;
        width = w;
        
    }
    void calculateArea(){
        System.out.println("Area = "+(length*width));
    }
}



public class ClassRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.insert(5, 6);
        r.calculateArea();
        Rectangle r1=new Rectangle(),r2=new Rectangle();//We can create multiple objects by one type only as we do in case of primitives.
        r1.insert(11, 6);
        r2.insert(12, 18);
        r1.calculateArea();
        r2.calculateArea();
    }
    
    
}
