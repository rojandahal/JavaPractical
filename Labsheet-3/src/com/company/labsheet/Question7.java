package com.company.labsheet;

import java.util.Scanner;

/**
 * 7. To find out sum of digits of a given integer of arbitrary length.
 */
public class Question7 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an Integer of Arbitrary Length: ");
        int num = scan.nextInt();
        int sum =0;
        while(num!=0){
            int temp = num%10;
            sum+=temp;
            num = num/10;
        }
        System.out.println("The sum of digit is: " + sum);
    }
}
