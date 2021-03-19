package com.company.labsheet1;

import java.util.Scanner;

/**
 * 10.	Write a program to evaluate the expression
 * (i) a + b (ii) a – b (iii) a x b (iv) a/b (v) Remainder of a/b.
 */
public class Question10 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two numbers a and b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int division = a/b;
        int remainder = a%b;
        System.out.println("(i) a + b = " + sum +
                "\n (ii) a – b = " + diff +
                "\n (iii) a x b = " + mul +
                "\n (iv) a/b = " + division +
                "\n (v) Remainder of a/b = " + remainder);

    }
}
