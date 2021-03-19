package com.company.labsheet;

import java.util.Scanner;

/**
 * 7.	Write a program to read three numbers and display the following menu.
 * Menu:
 * 1.	Summation
 * 2.	Sum of squares
 * 3.	Sum of cubes
 * 4.	Product
 * and perform tasks as per user’s choice. (use switch statements)
 */
public class Question7 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean loop = true;

        while(loop) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Summation\n" +
                    "2. Sum of squares\n" +
                    "3.Sum of Cubes\n" +
                    "4.Product\n" +
                    "5.Exit");
            int ch = scan.nextInt();
            switch (ch) {
                case 1:
                    int sum = a + b + c;
                    System.out.println("The sum is: " + sum);
                    break;
                case 2:
                    int sumSquare = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
                    System.out.println("The sum of squares is: " + sumSquare);
                    break;
                case 3:
                    int sumCubes = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
                    System.out.println("The sum of cubes is: " + sumCubes);
                    break;
                case 4:
                    int product = a * b * c;
                    System.out.println("The product is: " + product);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}
