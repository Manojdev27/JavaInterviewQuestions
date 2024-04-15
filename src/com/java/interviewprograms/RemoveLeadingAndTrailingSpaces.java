package com.java.interviewprograms;

public class RemoveLeadingAndTrailingSpaces {
    public static void main(String[] args) {

        String input = "  Emma Watson is an actress !!  ";

        System.out.println(input);
        //strip method is available from Java 11
        System.out.println(input.stripLeading());
        System.out.println(input.stripTrailing());
        String replacedText = input.strip();
        System.out.println(replacedText);
        System.out.println(input.replaceAll("^[ \t]+|[ \t]+$",""));
        System.out.println(input.replaceAll("^[ \t]+", ""));
        System.out.println(input.replaceAll("[ \t]+$", ""));
    }

}
