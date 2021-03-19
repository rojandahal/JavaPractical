    package com.company.labsheet;

    import java.util.Scanner;

    /**
     *  11. To generate the following Fibonacci series
     *  1, 1, 2, 3, 5, 8, ……………………….25 terms
     */
    public class Question11 {
        private static final Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Enter the number of terms: ");
            int num = scan.nextInt();
            int a=0;
            int b=1;
            int c= a+b;
            System.out.println("The fibonacci series is: ");
            for(int k=0; k<num; k++){
                System.out.print(" " + c);
                c = a+b;
                a=b;
                b=c;
            }
        }
    }
