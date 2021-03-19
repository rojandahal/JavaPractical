package com.company.labsheet1;

import java.util.Scanner;

/**
 * 7. Write a program to read base & altitude of a triangle & print its area:
 */
public class Question7 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the base of a triangle: ");
        int base = scanner.nextInt();
        System.out.println("Enter the altitude of a triangle");
        int altitude = scanner.nextInt();
        float area = (float) 1/2 * (base * altitude);
        System.out.println("The area of triangle is: " + area);

    }
}
