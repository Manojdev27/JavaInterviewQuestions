package com.java.interviewprograms;

import java.util.Scanner;

public class IsPalindrome {

    public void isPalindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str =  scanner.next();
//        String str = "Tenet";
        String input = str.toLowerCase();
        String reversed = "";

        for (int i = input.length() -1 ; i >= 0 ; i--) {
            reversed = reversed + input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println(str+ " is a Palindrome");
        }
        else{
            System.out.println(str+ " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        IsPalindrome palindrome= new IsPalindrome();
        palindrome.isPalindrome();
    }
}
