package com.company.labsheet;

import java.util.Scanner;

/**
 * 14. To find the factorial for n.
 * ( n! = nx (n-1) x (n-2) x …………….x 3 x 2 x1)
 */
public class Question14 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number n: ");
        int n = scan.nextInt();
        int fact=1;
        for (int i=0; i<n;i++){
            fact = fact* (n-i);
        }
        System.out.println(fact);
    }
}
