package com.company.labsheet;

/**
 *  3. To print all there digit Armstrong  numbers
 */
public class Question3 {
    public static void main(String[] args) {
        System.out.println("All the three digit armstrong number is: ");

        for (int i = 100; i<=999; i++){
            int sum=0;
            int temp = i;
            while(temp!=0){
                int rem = temp%10;
                sum = (int) (sum + Math.pow(rem,3));
                temp = temp/10;
            }
            if(sum == i ){
                System.out.println("Num: " + i);
            }
        }
    }
}
