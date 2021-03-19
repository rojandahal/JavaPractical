package com.company.labsheet1;

import java.util.Scanner;

/**
 *  5. Write a program to read the radius of sphere and compute its surface area and volume.
 */
public class Question5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float pi =(float) 22/7;

        System.out.println("Enter the radius of the sphere: ");
        int radius = scanner.nextInt();
        float surfaceArea = (float) (4 * pi * Math.pow(radius,2));
        float volume = (float) ((float)4/3 * pi * Math.pow(radius,3));
        System.out.println("The Surface Area is: " + surfaceArea);
        System.out.println("The volume is : " + volume);

    }
}
