package com.java.interviewprograms;

public class UpperCaseAndLowerCaseConversion {
    public void lowerCaseConversion(){
        String input = "HARRY POTTER";
        char[] charArray = input.toCharArray();

        for(int i=0; i<input.length();i++){
            if(charArray[i]>=65 && charArray[i]<=90){
                charArray[i] = (char) (charArray[i]+32);

            }
        }
        for (int i=0;i<charArray.length;i++){
            System.out.print(charArray[i]);
        }
    }

    public void upperCaseConversion(){
        String input = "harry potter";
        char[] charArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if(charArray[i]>=97 && charArray[i]<=122){
                charArray[i] = (char) (charArray[i]-32);

            }
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }
    public static void main(String[] args) {
       UpperCaseAndLowerCaseConversion upperCaseAndLowerCaseConversion = new UpperCaseAndLowerCaseConversion();
       upperCaseAndLowerCaseConversion.lowerCaseConversion();
       System.out.println();
       upperCaseAndLowerCaseConversion.upperCaseConversion();
}
}
