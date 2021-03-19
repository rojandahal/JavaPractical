package com.company.labsheet1;

/** Write a program to print Sum, Product and Quotient of two numbers 22 and 7 */
 public class Question2 {

    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 7;
        int sum = num1 + num2;
        int product = num1 * num2;
        float quotient = (float) num1/ num2;
        System.out.println("The sum, product and quotient is: \n" + "Sum = " + sum
            + " Product = " + product + " Quotient = " + quotient);
    }
}
