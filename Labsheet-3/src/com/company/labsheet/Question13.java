package com.company.labsheet;

import java.util.Scanner;

/**
 * 13. Write a program to read x and n, and generate the following series & print the sum.
 * x + 2/x2 -3/x3 + 4/x4 -5/x5……………………n terms
 */
public class Question13 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int x = scan.nextInt();
        System.out.println("Enter the number of term: ");
        int n = scan.nextInt();
        int sum =0;
         for(int i=1; i<=n; i++){
             if(i==1){
                 System.out.print(x);
                 continue;
             }
             float term = (float) (Math.pow(-1,i) * (i / Math.pow(x,i)));
             sum+= term;
             if(Math.pow(-1,i)<0){
                 System.out.print(" " + term);
             }else
                 System.out.print(" + " + term);
         }
        System.out.println("\nThe sum is: " + sum);
    }
}
