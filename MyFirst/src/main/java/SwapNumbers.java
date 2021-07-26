/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class SwapNumbers {
    public static void main(String a[]){
        int i,j,temp;
        i=5;j=4;
        temp= i;
        i=j;
        j=temp;
        System.out.println("i= "+i);
        System.out.println("j= "+j);
        
        //////////////////////////////////////////////
        
        int p=5,q=4;
        p=p+q;
        q=p-q;
        p=p-q;
        System.out.println("p= "+p);
        System.out.println("q= "+q);
        
        ////////////////////////////////////////////
        int c=5,d=4;
        c=c^d;//XOR operation
        d=c^d;
        c=c^d;
        System.out.println("c= "+c);
        System.out.println("d= "+d);
        /////////////////////////////////////////////
        
        int m=5,n=6;
        n=m+n-(m=n);
        System.out.println("m= "+m+" n= "+n );
    }
    
}
