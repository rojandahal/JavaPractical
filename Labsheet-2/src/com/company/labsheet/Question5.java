package com.company.labsheet;

import java.util.Scanner;

/**
 * 5. Write a program to read three sides of triangle and print area for valid data and to print “Invalid data”
 * either one side of the triangle is greater or equals to the sum of other two sides.
 */
public class Question5 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the three sides of a triangle: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a >= b + c || b >= c + a || c >= a + b) {
            System.out.println("The triangle is Invalid");
        } else {
            float s = (float) (a + b + c) / 2;
            float temp = s*(s-a)*(s-b)*(s-c);
            float area = (float) Math.sqrt(temp);
            System.out.println("The area of Triangle is: " + area);
        }
    }
}
