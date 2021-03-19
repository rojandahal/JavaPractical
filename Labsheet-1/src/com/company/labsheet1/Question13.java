package com.company.labsheet1;

/**
 * 13.	Write a program to compute:
 *          2.9678 x 10e-27 + 0.876 x 10e-38
 * F = 	_____________________________________
 *          7.025 x 10e16 – 9.75 x 10e12
 */
public class Question13 {
    public static void main(String[] args) {
        float numerator = (float) ((float) (2.967 * Math.pow(10,-27)) + (0.876*Math.pow(10,-38)));
        float denominator = (float) ((7.025*Math.pow(10,16)) - (9.75*Math.pow(10,12)));
        float F = numerator / denominator;
        System.out.println(" The value of F is : " + F);
    }
}
