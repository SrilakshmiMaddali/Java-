/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 * 
 * If you declare any variable as static, it is known as a static variable.

The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.
Advantages of static variable
It makes your program memory efficient (i.e., it saves memory).
 * 
 */
public class StaticCounter {
    static int count =0;//static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value. 
    StaticCounter(){
    count++;
    System.out.println(count);
    
    }
    
    public static void main(String[] args) {
        StaticCounter sc = new StaticCounter();
        StaticCounter sc1 = new StaticCounter();
        StaticCounter sc2 = new StaticCounter();
    }
    
}
