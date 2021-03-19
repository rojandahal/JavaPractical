package com.company.labsheet1;

/** 1. Write a Java Program to calculate the volume of a pool.
 * The equation for determining the volume is Volume = length x width x depth.
 * Assume that the pool has a length of 25 feet, a width of 10 feet and depth 6 feet.
 */

 public class Question1 {

    public static void main(String[] args) {
	    int length = 25;
	    int width = 10;
	    int depth = 6;
	    int volume = length * width * depth;
        System.out.println("The volume of the pool is : " + volume);
    }
}
