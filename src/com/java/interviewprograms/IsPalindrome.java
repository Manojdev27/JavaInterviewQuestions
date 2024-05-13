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

    public void numberIsPalindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        int givenNumber = input;

        int reversed = 0;

        while (input!=0){
            reversed = reversed * 10;
            reversed = reversed + input % 10;
            input = input / 10;
        }
            if(givenNumber == reversed){
                System.out.println("The provided number "+ givenNumber + " "+"is Palindrome");
            }
            else {
                System.out.println("The provided number "+ givenNumber +" "+"is not Palindrome");
            }

    }
    public static void main(String[] args) {
        IsPalindrome palindrome= new IsPalindrome();
        palindrome.isPalindrome();
        palindrome.numberIsPalindrome();

    }
}
