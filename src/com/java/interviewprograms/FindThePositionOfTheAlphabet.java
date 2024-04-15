package com.java.interviewprograms;

import java.util.Scanner;

public class FindThePositionOfTheAlphabet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String:");
        char givenChar = scanner.next().charAt(0);
        System.out.println(givenChar);
        givenChar = Character.toLowerCase(givenChar);
        int asciiValue = (int) givenChar;
        System.out.println(asciiValue);
        int position = asciiValue-96;
        System.out.println(position);


    }
}
