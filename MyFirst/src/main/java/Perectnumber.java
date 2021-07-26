/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class Perectnumber {
    public static void main(String a[]){
        int n=28;//Perfect number is i we add factors of that particular number we should get the same number like 28 -> 1+2+4+7+14 or 6-> 1+2+3
        boolean b = isPerfect(n);
        if(b)
            System.out.println("It's a perfect number!");
        else
            System.out.println("Not a perect number");
    }
    
    public static boolean isPerfect(int n){
        int sum =0;
        for (int i=1; i<=n/2;i++){
            if (n%i==0)
                sum+=i;
        }
        if (sum==n)
            return true;
         
        return false;
            
    }
    
}
