package com.company.labsheet1;

import java.util.Scanner;

/**
 *  4. Write a program to input length & breadth of a room & calculate & print its area & perimeter.
 */
public class Question4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the room: ");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the room: ");
        int breadth = scanner.nextInt();
        int area = length * breadth;
        int perimeter = 2* (length+ breadth);
        System.out.println("The area and perimeter are: " + area + " " + perimeter + " respectively");
    }
}
