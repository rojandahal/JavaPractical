package com.company.labsheet;

/**
 * 6. To print multiplication table in the following format:
 * 1	2	3	4	5	6	7	8	9	10	11	12
 * 2	4	6	8	10	12	14	16	18	20	22	24
 * .	.	.	.	.	.	.	.	.	.	.	.
 * 12	24	36	48	60	72	84	96	108	120	132	144
 */
public class Question6 {
    public static void main(String[] args) {
        for(int i=1; i<=12; i++){
            System.out.println("");
            for(int j=1; j<=12; j++){
                System.out.print(i*j + "\t");
            }
        }
    }
}
