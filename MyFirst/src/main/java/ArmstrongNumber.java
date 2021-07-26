/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 * Armstrong number is if we add the cubes of the individual numbers i we get the same number. 
 * like 153 -> 1*1*1 + 5*5*5 +3*3*3
 * 370
 * 371
 * 
 */
public class ArmstrongNumber {
    public static void main(String a[]){
        int n=153;//370,371
        boolean b = isArmstrong(n);
        if (b)
            System.out.println("It's an Armstrong number!");
        else 
            System.out.println("Not an Armstrong number!");
        
    }
    public static boolean isArmstrong(int n){
        int sum = 0,r,k;
        k=n;
        while(n>0){
            r= n%10;
            n=n/10;
            sum = sum+r*r*r;
            
        }
        if (sum == k)
            return true;
        return false;
    
    }
    
}
