/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank;

import java.util.Scanner;

/**
 *
 * If both values are greater than zero, then the main method must output the area of the parallelogram. 
 * Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 * @author srilakshmimaddali
 */
public class Parallellogramarea {

    static Boolean flag = true;
    static int B, H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}
