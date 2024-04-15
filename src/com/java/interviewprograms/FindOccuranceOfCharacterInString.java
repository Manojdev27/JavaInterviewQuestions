package com.java.interviewprograms;

public class FindOccuranceOfCharacterInString {

    public void usingIteration(){
        String input = "Harry Potter";
        char  toFind = 't';
        int occurance = 0;

        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==toFind){
                occurance = ++occurance;

            }
        }
        System.out.println(toFind+ " is present "+ occurance + " number of times");
    }

    public void withoutIteration(){
        String input = "Harry Potter";
        char  toFind = 'r';
       input = input.toUpperCase();
       String charToFind = Character.toString(toFind).toUpperCase();
       int actualLength = input.length();
       System.out.println(actualLength);
        input = input.replace(charToFind, "");
        int lengthAfterReplacing = input.length();
        System.out.println(lengthAfterReplacing);
        System.out.println(toFind+ " is present "+ (actualLength-lengthAfterReplacing) + " number of times");
    }
    public static void main(String[] args) {

        FindOccuranceOfCharacterInString findOccuranceOfCharacterInString = new FindOccuranceOfCharacterInString();
        findOccuranceOfCharacterInString.usingIteration();
        findOccuranceOfCharacterInString.withoutIteration();

    }
}
