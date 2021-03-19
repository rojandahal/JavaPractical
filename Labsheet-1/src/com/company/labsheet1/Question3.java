package com.company.labsheet1;

import java.util.Scanner;

/** Write a program to input age of a person and print in days with appropriate prompts. */

 public class Question3 {

     private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the age of a person: ");
        int age = input.nextInt();
        int ageInDays = age * 365;
        System.out.println("The age in days is : " + ageInDays);
    }
}
