package com.company.labsheet;

import java.util.Scanner;

/**
 * 11.	An organization is dealing in Two items say A and B and provides the commission on of sale of these items according to the following policies:
 * i)   Commission rate for item A is 5% up to a sale of Rs. 2,000. If the sale of item A above 2000 then the commission is 6% on the extra sale.
 * ii)  For B, 10% up to sale of Rs 4,000 if the sale is above 4,000 commission rate is 12% on extra sale:
 *        Given the sales of both the items, write a program to compute net commission.
 */
public class Question11 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the sale of Item A and Item B: ");
        int saleA = scan.nextInt();
        int saleB = scan.nextInt();
        double commissionA =0;
        if(saleA <=2000){
            commissionA = (float) 2000*0.05;
        }else{
            double firstCom = (float)2000*0.05;
            int extraSale = saleA - 2000;
            commissionA = firstCom + (float)extraSale*0.06;
        }

        double commissionB=0;
        if(saleB <=4000){
            commissionB = (float) 4000*0.1;
        }else{
            double firstCom = (float)4000*0.1;
            int extraSale = saleB - 4000;
            commissionB = firstCom + (float)extraSale*0.12;
        }

        double netCommission = commissionA + commissionB;
        System.out.println("The net commission is: " + netCommission);

    }
}
