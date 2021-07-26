
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class Fibonacci {
    public static void main(String a[]){
        int k=0,p=1,q=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        System.out.print(p+" "+q+" ");
        while (k<=n)
        {
           k=p+q;
           if(k>=n)
               break;
           System.out.print(k+" ");
           p=q;
           q=k;
        }
        
        
    }
    
}
