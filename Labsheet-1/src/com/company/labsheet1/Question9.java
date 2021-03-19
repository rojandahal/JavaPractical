package com.company.labsheet1;

import java.util.Scanner;

/**
 * 9. Write a program to input four numbers and print percentages of each numbers on their sum.
 */
public class Question9 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter four numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int sum = a + b + c + d;
        System.out.println("Percentage of a in sum: " + (float)a/sum *100 );
        System.out.println("Percentage of b in sum: " + (float)b/sum *100 );
        System.out.println("Percentage of c in sum: " + (float)c/sum *100 );
        System.out.println("Percentage of d in sum: " + (float)d/sum *100 );
    }
}
