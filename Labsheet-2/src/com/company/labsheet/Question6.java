package com.company.labsheet;

import java.util.Scanner;

/**
 * 6.Write a program to read four integer numbers and print the maximum.
 */
public class Question6 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int maxValue = Integer.MIN_VALUE;
        System.out.println("Enter four integer number: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if(a>maxValue)
            maxValue = a;
        if(b>maxValue)
            maxValue =b;
        if(c>maxValue)
            maxValue =c;
        if(d>maxValue)
            maxValue = d;

        System.out.println("The maximum is: " + maxValue);
    }
}
