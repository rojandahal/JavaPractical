package com.company.labsheet;

import java.util.Scanner;

/**
 * 1. Write a program to calculate and print compound interest amount (f) when p,n,r are given
 * (Formula : f = p x (l +r)n, r should be given in decimal like. (r = 0.15)
 */
public class Question1 {
    private static final Scanner scan = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.println("Enter the amount: ");
        int p = scan.nextInt();
        System.out.println("Enter the time: ");
        int n = scan.nextInt();
        System.out.println("Enter the rate: ");
        float r = scan.nextFloat();

        float f = (float) (p * Math.pow((1 + r),n));
        System.out.println("The compound interest is: " + f);
    }
}
