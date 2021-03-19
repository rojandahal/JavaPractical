package com.company.labsheet1;

import java.util.Scanner;

/**
 * 8. Write a program to calculate simple interest amount for deposit amount (P) kept in bank for (n) years at the rate of (r) simple interest per annum.
 */
public class Question8 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the deposit amount in bank: ");
        int p = scanner.nextInt();
        System.out.println("Enter the time(in years) for which the amount is kept: ");
        int n = scanner.nextInt();
        System.out.println("Enter the rate: ");
        float r = scanner.nextFloat();

        float SI = (float) p * n * r;
        System.out.println("The simple interest is: " + SI);

    }
}
