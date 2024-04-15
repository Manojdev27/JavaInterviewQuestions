package com.java.interviewprograms;

public class ExtractNumFromStringAndAdd {
    public static void main(String[] args) {

        String input = "Harry Potter's birthday is 31/07";
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if(Character.isDigit(character)){
                total = total+Character.getNumericValue(character);

            }
        }
        System.out.println(total);

    }

    
}
