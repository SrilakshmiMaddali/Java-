/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class Shorthand {
    public static void main(String a[]){
        int i,j,k;
        i = 10;
        j = 12;
        k=i+j;
        System.out.printf("The addition of %d and %d is %d\n",i,j,k);
        k=i&j;//bitwise and
        System.out.println(k);
        k=i|j;//bitwise or
        System.out.println(k);
        
        
        byte b =8;
        b *= 2.5;
        System.out.println(b);
        
        //int x = 0B101;
        //int x = 0B100000;
        int x = 0B100_00_00_00;
        System.out.println(x);
        
        int p = 25;
        int q = p>>2;//right shift operator
        System.out.println(q);
        q = p<<2;//left shift operator
        System.out.println(q);

        boolean c = true;
        boolean d = !c;
        System.out.println(c);
        System.out.println(d);
        
        
    }
            
    
}
