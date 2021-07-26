/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class Starpatterns {
    public static void main(String a[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            } 
            System.out.println();
        
        } 
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            } 
            System.out.println();
        
        } 
        
        
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print("* ");
            } 
            System.out.println();
        
        }   
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if (i==1||i==4||j==1||j==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            } 
            System.out.println();
        
        }  
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if (i==1||i==4||j==1||j==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            } 
            System.out.println();
        
        }

        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                //if (j==4)
                  //]  j=1;
                System.out.print(j);
                
            } 
            System.out.println();
        
        }  
        
        for(int i=1;i<=4;i++){
            int k=i;
            for(int j=1;j<=4;j++){            
                if (k>4)
                    k=1;                        
                System.out.print(k);
                k++;
            } 
            System.out.println();
        
        } 
        for(int i=1;i<=4;i++){
            
            for(int j=1;j<=4;j++){  
                int k=i+j-1;
                if (k>4)
                    System.out.print(k-4);  
                else
                    System.out.print(k);
              
            } 
            System.out.println();
        
        } 
        
        /*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
        */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            } 
            System.out.println();
        
        } 
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            } 
            System.out.println();
        
        }   
        
        
        
    
    }
    
}
