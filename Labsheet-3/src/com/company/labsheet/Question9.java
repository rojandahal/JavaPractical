package com.company.labsheet;

import java.util.Scanner;

/**
 *  9. To find out octal equivalent when a decimal integer number is given.
 */
public class Question9 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        int decimal = scan.nextInt();
        String octal = "";
        char octalchars[]={'0','1','2','3','4','5','6','7'};
        while(decimal>0)
        {
            int rem=decimal%8;
            octal=octalchars[rem]+octal;
            decimal=decimal/8;
        }
        System.out.println("The octal is: " + octal);
    }
}
