package com.company.labsheet;

import java.util.Scanner;

/**
 * 12. To find the series for given X (integer)
 * 1 + X + X2 + X3 + X4 + X6 + X7 + ………………. + up to term value< 999999
 */
public class Question12 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an integer X: ");
        int x = scan.nextInt();
        int term = 0;
        for(int i =0; term<999999; i++){
            if(i==5){
                continue;
            }
            term = (int) Math.pow(x,i);
            System.out.print(term + " + ");
        }

    }
}
