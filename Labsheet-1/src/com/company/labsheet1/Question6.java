package com.company.labsheet1;

import java.util.Scanner;

/**
 * 6. Write a program to input temperature in Celsius & to print its Fahrenheit equivalent
 */
public class Question6 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter temperature in celsius: ");
        int celsius = scanner.nextInt();
        float fahrenheit = ((celsius * (float)9/5) + 32);
        System.out.println("The temperature in fahrenheit is : " + fahrenheit);
    }
}
