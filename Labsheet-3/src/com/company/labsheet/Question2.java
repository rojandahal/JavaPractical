package com.company.labsheet;

import java.util.Scanner;

/**
 * 2.   To read any integer number and to print its multiplication table.
 */
public class Question2 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("The multiplication table is: ");
        for (int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + i*num);
        }
    }
}
