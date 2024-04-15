package com.java.interviewprograms;

public class FindVowels {

    public static void main(String[] args) {
        String input = "Hermione Granger";
        int vowelsCount = 0;
        input = input.toLowerCase();
        int length = input.length();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    ||input.charAt(i) == 'u')

            {
                vowelsCount = ++vowelsCount;
            }
        }
        System.out.println("The input has "+vowelsCount+ " vowels");

    }
}
