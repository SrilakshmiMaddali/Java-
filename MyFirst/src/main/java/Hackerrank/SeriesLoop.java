/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank;

import java.util.Scanner;

/**
a+2^0*b+2^1*b+2^2*b+2^3*b+........+2^n-1*b
*We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 * 
 * 
 * @author srilakshmimaddali
 */
public class SeriesLoop {
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result;
            for(int j=0;j<n;j++){
                result = 0;
                for (int k=0;k<=j;k++){
                    result+=Math.pow(2,k)*b; 
                }
                System.out.print(a+result+" ");
            } 
            System.out.println();
            
        }
        in.close();

        
    }    
    
}
