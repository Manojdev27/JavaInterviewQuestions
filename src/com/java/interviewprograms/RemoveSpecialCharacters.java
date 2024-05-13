package com.java.interviewprograms;

public class RemoveSpecialCharacters {

    public static String removeCharacters(String str){
        return str.replaceAll("[^a-zA-Z0-9]","");
    }
    public static String removeWhiteSpaces(String str){

        return str.replaceAll("\\s","");

    }
    public static void main(String[] args) {
     String string = "@$&%#* Good Morning123";
     System.out.println(removeCharacters(string));
     String string1 = "  Java  programming Language is Powerful ";
     System.out.println("Before removing White spaces: "+string1);
     System.out.println("After removing White spaces: "+removeWhiteSpaces(string1));

    }
}
