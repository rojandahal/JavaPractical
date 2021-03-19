package com.company.labsheet;

import java.util.Scanner;

/**
 *  5. To read 15 person age & find out how many persons fall under the following categories :
 * a) Still a baby-age 0 to 5
 * b) Attending School –age 6 to 17
 * c) Adult life – age 18 & over
 */
public class Question5 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int baby=0, attendingScl=0, adult=0;
        for (int i=0; i<15; i++){
            System.out.println("Enter the age of " + (i+1) +" person");
            int age = scan.nextInt();
            if(age>=0 && age<=5){
                baby++;
            }else if( age>=6 && age<=17){
                attendingScl++;
            }else{
                adult++;
            }
        }
        System.out.println("Still a baby: " + baby);
        System.out.println("Attending School: " + attendingScl);
        System.out.println("Adult life: " + adult);
    }
}
