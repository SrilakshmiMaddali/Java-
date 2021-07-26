/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class EnhancedFor {
    public static void main(String[] args) {
        int a[] = new int[5];
        for(int i=0;i<a.length;i++)
            a[i]=i+1;
        for (int i:a)
            System.out.println(i);
            
                
    }
    
}
