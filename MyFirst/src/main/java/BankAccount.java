/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */

//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  

class Account{
    int acc_no;
    String name;
    float amt;
    void insert(int num,String nme,float amount){
        acc_no = num;
        name = nme;
        amt=amount;        
    }
    void deposit(float amount){
        amt+=amount;
        System.out.println(amount+" Deposited!"+"Available balance is "+amt);
    }
    
    void withdraw(float amount){
        if (amount>amt)
            System.out.println("Insufficient funds!");
        else{
            amt-=amount;
            System.out.println(amount+" Withdrawn!"+"Available balance is "+amt);
        }
    
    }


}

public class BankAccount {
    public static void main(String[] args) {
        Account act = new Account();
        act.insert(101, "Sri", 1000);
        act.deposit(100);
        act.withdraw(1200);
        act.withdraw(150);
        
    }
    
    
}
