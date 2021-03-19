package com.company.labsheet;

import java.util.Scanner;

/**
 * 8.   Write a program to read a character and to test whether it is an alphabet or a number or a special character.
 */
public class Question8 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        char a = scan.next().charAt(0);
        int ascii = (int) a;
        if((ascii>=97 && ascii<=122) || (ascii>=65 && ascii<=90)){
            System.out.println("It is an alphabet. ");
        }else if (ascii>=48 && ascii<=57){
            System.out.println("It is a number.");
        }else
            System.out.println("It is a special character");

    }
}
