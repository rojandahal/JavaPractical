package com.company.labsheet;

import java.util.Scanner;

/**
 * 4.	Write a program to read to read length and breadth of a room and print area and print.
 *      “Auditorium” if area >2500
 *      “Hall” if 500 < = area <=2500
 *      “Big room” if 150 < area < 500
 *      “Small room” if area < = 150
 */
public class Question4 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter length and breadth of the room: ");
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        int area = length*breadth;

        if(area<=150){
            System.out.println("Small Room");
        }else if(area<500){
            System.out.println("Big Room");
        }else if (area<=2500){
            System.out.println("Hall");
        }else
            System.out.println("Auditorium");

    }
}
