package com.company.labsheet;

import java.util.Scanner;

/**
 *  10. To generate the following series and print sum.
 *  1 x 4, 2 x 7, 3 x 10, ……………………… n terms
 */
public class Question10 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of terms: ");
        int n = scan.nextInt();
        int j =4;
        for(int i=0; i<n; i++){
            System.out.print((i+1) + " X " + j + (","));
            j+=3;

        }
    }
}
