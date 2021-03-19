package com.company.labsheet;

import java.util.Scanner;

/**
 * 2. Write a program to calculate the real roots of the quadratic equation  ax2 + bx + c = 0,
 * using quadratic equation.
 */
public class Question2 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter values for a,b,c of ax2+bx+c: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        float r1 = (float) (Math.pow(b,2)-(4*a*c));
        if(r1<0){
            System.out.println("It has imaginary roots.");
        }else {
            float r2 = (float) (-b + Math.sqrt(r1));
            float r3 = (float) (-b - Math.sqrt(r1));

            float root1 = r2 / (2*a);
            float root2 = r3 / (2*a);
            System.out.println("The roots are: " +
                    root1 + " and " +
                    root2);
        }

    }
}
