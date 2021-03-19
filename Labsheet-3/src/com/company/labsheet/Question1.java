package com.company.labsheet;

/**
 *  1. To print table of ASCII Characters for code 32 to 255.
 */
public class Question1 {
    public static void main(String[] args) {
        System.out.println("ASCII Characters from 32 to 255: ");
        for (int i =32; i<=255; i++){
            char x = (char) i;
            System.out.println("Asci at " + i + " is: " + x);
        }
    }
}
