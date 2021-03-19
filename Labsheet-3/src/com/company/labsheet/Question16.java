package com.company.labsheet;

import java.util.Scanner;

/**
 * 16. To type a phrase (sentence) and to find out consonants vowels & spaces counts.
 */
public class Question16 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        int vCount = 0, cCount = 0, sCount = 0;
        String str = scan.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            } else if (str.charAt(i) == ' ') {
                sCount++;
            }
        }
        System.out.println("No of vowel: " + vCount);
        System.out.println("No of Consonant: " + cCount);
        System.out.println("No of space: " + sCount);
    }
}
