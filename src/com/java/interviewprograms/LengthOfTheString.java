package com.java.interviewprograms;

import java.util.Scanner;

public class LengthOfTheString {

    public void countTheWordsInAString(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = scanner.nextLine();
        int count =1;
        for (int i = 0; i < string.length()-1; i++) {
            if ((string.charAt(i) ==' ') && (string.charAt(i+1)!=' ')){
                count++;

            }
        }
        System.out.println("Number of words in a String: " +count);
    }
    public static void main(String[] args) {

        String str = "Harry";
        char[] charArray = str.toCharArray();
        int length = 0;
        for(char c:charArray){
            length++;
        }
        System.out.println(length);

        System.out.println(str.length());

        LengthOfTheString lengthOfTheString = new LengthOfTheString();
        lengthOfTheString.countTheWordsInAString();

    }


}
