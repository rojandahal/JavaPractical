package com.company.labsheet1;

import java.util.Scanner;

/**
 * 12. Given a 5 digit integer number. Write a program to print it in reverse order
 *       (e.g. 92674  47629)
 */
public class Question12 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 5 digit number: ");
        int num = scan.nextInt();
        int rev = 0;
        while(num!=0){
            int rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }
        System.out.println("Reverse number is: " + rev);
    }
}
