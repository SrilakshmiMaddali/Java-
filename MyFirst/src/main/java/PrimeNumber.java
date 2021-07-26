/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class PrimeNumber {
    public static void main(String a[]){
        int n = 3;//10;//9;//7;//25;
        boolean b = isPrime(n);
        if(b)
            System.out.println("It's a Prime number");
        else
            System.out.println("Not a prime number");
    
    }
    
    public static boolean isPrime(int num){
        boolean temp=true;
        for(int i=2;i<num/2;i++){ //for (int i=2;i<Math.sqrt(num);i++) 
            if (num%i==0){
                temp= false;
                break;
                
            }
        }
        return temp;
            
    
    }
    
}
