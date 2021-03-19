package com.company.labsheet;

import java.util.Scanner;

/**
 * 9.   Write a program to read average temperature of a day in Fahrenheit to print.
 * “Nice day” if temperature is greater than 60 but less than 80.
 * “Cold day” if temperature is 60 or lower.
 * “Hot day” if temperature is 80 higher.
 */
public class Question9 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter temperature in Fahrenheit.");
        float temp = scan.nextFloat();
        if (temp<=60){
            System.out.println("It is a cold day.");
        }else if(temp<80){
            System.out.println("It is Nice Day.");
        }else
            System.out.println("It is Hot day");

    }
}
