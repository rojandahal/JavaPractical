package com.company.labsheet;

import java.util.Scanner;

/**
 *  4. To read 15 person age and print maximum, minimum & average age.
 */
public class Question4 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i=0; i<15; i++){
            System.out.println("Enter the age of " + (i+1) +" person");
            int age = scan.nextInt();
            if(age>max){
                max = age;
            }
            if(age<min){
                min = age;
            }
            sum = sum+ age;
        }
        System.out.println("The max age is: " + max);
        System.out.println("The min age is: " + min);
        System.out.println("The average age is: " + (float)sum/15);
    }
}
