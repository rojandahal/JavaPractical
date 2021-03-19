package com.company.labsheet;

import java.util.Scanner;

/**
 *  8. To find out decimal equivalent of a given octal number of arbitrary length.
 */
public class Question8 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an octal number: ");
        int octal = scan.nextInt();
        int decimal =0;
        int n=0;
        while(true){
            if(octal == 0){
                break;
            } else {
                int temp = octal%10;
                decimal += temp*Math.pow(8, n);
                octal = octal/10;
                n++;
            }
        }

        System.out.println("The decimal equivalent is: " + decimal);
    }
}
