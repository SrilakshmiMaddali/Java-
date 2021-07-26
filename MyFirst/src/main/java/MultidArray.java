/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class MultidArray {
    public static void main(String[] args) {
        int x[]={5,6,7,8};
        int y[]={6,7,8,9};
        int z[]={1,2,3,4};
        int p[][]={
                    {5,6,7,8},
                    {6,7,8,9},
                    {1,2,3,4}
                    
                };
        int a[]=new int[5];
        int b[][]=new int[4][5];
        int c[][][]=new int [4][4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    c[i][j][k]=i+j+k;
                }
            }
        }
        
        for(int i[][]:c){
            for(int j[]:i){
                for(int k:j){
                    System.out.print(k+" ");

                }
            }
        }
        
        /*for (int i[]:p){
            for (int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        
        /*
        for (int i=0;i<p.length;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(p[i][j]+" ");
            }
            System.out.println("");        
        
        }*/
        
        
        
    }
    
}
