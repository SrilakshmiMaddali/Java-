
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class Randomfor {
    public static void main(String[] args) {
        int a[] = new int[20];//20 is the size of the array
        Random r = new Random();
        
        for(int i=0;i<a.length;i++)
            a[i] = r.nextInt(50);//to limit the number to be less than 50
        
        try{
        System.out.println(a[50]);
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Maximum index is 19");
        }
        
        
        for(int i:a)
           System.out.println(i);
        
               
    }
    
}
