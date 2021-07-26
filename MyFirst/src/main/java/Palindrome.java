
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
public class Palindrome {
    public static void main(String a[]){
        int r,s=0,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt();
        k = n;
        while (n>0)
        {
            r = n%10;
            n = n/10;
            s = s*10+r;
        }
        if (s==k)
            System.out.println("That's a palindrome number");
        else 
            System.out.println("Not a palindrome number");
    }
    
}
