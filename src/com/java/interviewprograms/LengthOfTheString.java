package com.java.interviewprograms;

public class LengthOfTheString {

    public static void main(String[] args) {

        String str = "Harry";
        char[] charArray = str.toCharArray();
        int length = 0;
        for(char c:charArray){
            length++;
        }
        System.out.println(length);

        System.out.println(str.length());

    }


}
