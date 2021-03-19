package com.company.labsheet;

import java.util.Scanner;

/**
 * 12.	A bank accepts deposit for 1 year or more and the policies it adopts on interest rate as follows:
 * i)	if deposit is less than Rs. 1,000 and for 2 or more years than interest rate is 5% compounded annually
 * ii)	If the deposit is Rs 1,000 or more but less then Rs. 5,000 and for 2 or more years the interest rate 7% compounding annually.
 * iii)	If deposit is more then Rs. 5,000 and is for one year or more the interest rate is 8% compound annually.
 * iv)	On all deposit for 5 years or more, interest is 10% compounded annually
 * v)	On all other deposit not covered by the above conditions the interest is 3% compounded annually.
 * At the time of withdrawal, costumer’s data is given with amount deposited and the number of years the
 * money has been with the bank. Write a program to obtain the total money in the costumer’s account and
 * the interest credited at the time of withdrawal.
 */
public class Question12 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int deposit;
        float totalAmount, interest;
        int time;
        System.out.println("Enter the amount to be deposited: ");
        deposit = scan.nextInt();
        totalAmount = deposit;
        System.out.println("Enter the time to be deposited: ");
        time = scan.nextInt();
        if(deposit<1000 && time>=2){
            interest = (float) (deposit * Math.pow(1+0.05,time) - deposit);
            totalAmount = totalAmount + interest;
        }else if ((deposit>=1000 && deposit<5000) && time>=2){
            interest = (float) (deposit * Math.pow(1+0.07,time))- deposit;
            totalAmount = totalAmount + interest;
        }else if (deposit>5000 && time>=1 ){
            interest = (float) (deposit * Math.pow(1+0.08,time))- deposit;
            totalAmount = totalAmount + interest;
        }else if(time>=5){
            interest = (float) (deposit * Math.pow(1+0.10,time))- deposit;
            totalAmount = totalAmount + interest;
        }else{
            interest = (float) (deposit * Math.pow(1+0.30,time))- deposit;
            totalAmount = totalAmount + interest;
        }

        System.out.println("Account Details: ");
        System.out.println("Amount Deposited: " + deposit);
        System.out.println("Deposited Years: " + time);
        System.out.println("Total Amount in Account: " + totalAmount);
        System.out.println("Interest Acquired: " + interest);
    }
}
