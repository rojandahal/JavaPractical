package com.company.labsheet1;

import java.util.Scanner;

/**
 * 11. Write a program to input 5 digit integer number and print sum of digits in it.
 */
public class Question11 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 5 digit number: ");
        int num = scan.nextInt();
        int sum = 0;
        while(num!=0){
            int rem = num%10;
            sum+=rem;
            num = num/10;
        }
        System.out.println("The sum is: " + sum);
    }
}
