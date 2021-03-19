package com.company.labsheet;

import java.util.Scanner;

/**
 * 17.	Write a program that repeatedly calculates how many characters separate two letters typed in by the user.
 */
public class Question17 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a first character: ");
        char ch = scan.next().charAt(0);
        System.out.println("Enter second character: ");
        char ch2 = scan.next().charAt(0);
        int count=0;
        for(int c =ch; c<=ch2; c++){
            count++;
        }
        System.out.println("The number of character between " + ch + " and " + ch2 + "is: " + (count-2));

    }
}
