/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srilakshmimaddali
 */
public class Demolabeledbreak {
    public static void main(String a[])
    {
        mainor:
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=4;j++)
            {
                if(i==3)
                    break mainor;//labeled break
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
