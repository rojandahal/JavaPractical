package com.company.labsheet;

import java.util.Scanner;

/**
 * 10.	Write a program to read 3-digits number and test whether it is a Armstrong number or not Armstrong.
 */
public class Question10 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a three digit number: ");
        int num = scan.nextInt();
        int temp = num;
        int sum =0;
        while(temp!=0){
            int digit = temp %10;
            sum += Math.pow(digit,3);
            temp = temp/10;
        }
        if(sum == num){
            System.out.println("It is armstrong number.");
        }else
            System.out.println("It is not armstrong number");
    }
}
