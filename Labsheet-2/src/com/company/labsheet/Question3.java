package com.company.labsheet;

import java.util.Scanner;

/**
 * 3. Write a program to find whether the given 4–digit number (Year) is a leap year or not leap year
 */
public class Question3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean leap=true;
        System.out.println("Enter a 4 digit year: ");
        int year = scan.nextInt();
         if(year%4==0){
             if(year%100==0){
                 if(year%400==0){
                 }else leap = false;
             }
         }else leap = false;

        if(!leap){
             System.out.println("It is not a leap year.");
         }else
             System.out.println("It is a leap year.");
    }
}
