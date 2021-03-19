package com.company.labsheet;

/**
 * 15. To print first 50 prime numbers.
 */
public class Question15 {
    public static void main(String[] args) {
        int cnt =0,i=1;
        while(cnt!=50){
            int div =0;
            for(int j=1;j<=Math.sqrt(i); j++){
                if(i%j==0){
                    div++;
                }
            }
            if(div==1){
                System.out.println(i);
                cnt++;
            }
            i++;
        }
    }
}
