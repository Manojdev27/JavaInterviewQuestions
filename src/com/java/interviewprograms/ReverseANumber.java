package com.java.interviewprograms;

import java.util.Scanner;

public class ReverseANumber {
    public void reverseANumber() {

        int givenNumber = 0;
        System.out.println("Enter your number");
        Scanner scanner =new Scanner(System.in);
        givenNumber = scanner.nextInt();
            int reversedNumber = 0;
            while (givenNumber!=0) {
                reversedNumber = reversedNumber * 10;
                reversedNumber = reversedNumber + givenNumber % 10;
                givenNumber = givenNumber / 10;
            }
        System.out.println(reversedNumber);
    }
    public static void main(String[] args) {
       ReverseANumber reverseANumber = new ReverseANumber();
       reverseANumber.reverseANumber();
    }
}
