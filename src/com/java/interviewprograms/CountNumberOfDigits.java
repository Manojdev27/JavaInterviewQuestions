package com.java.interviewprograms;

import java.util.Scanner;

public class CountNumberOfDigits {

    public void countDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        int count = 0;

        while (input>0){
            input = input/10;
            count++;
        }
        System.out.println("The Number of digits is "+ count);
    }

    public static void main(String[] args) {
        CountNumberOfDigits countNumberOfDigits = new CountNumberOfDigits();
        countNumberOfDigits.countDigits();
    }
}
