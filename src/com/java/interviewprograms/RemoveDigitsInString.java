package com.java.interviewprograms;

public class RemoveDigitsInString {

public static String removeDigits(String str){
    char[] charArray = str.toCharArray();
    String result = "";

    for (int i=0; i<charArray.length;i++){
        if(!Character.isDigit(charArray[i])){
            result = result + charArray[i];
        }
    }
    return result;
}
public static String removeAllDigits(String string){
    return string.replaceAll("\\d","");
}
    public static void main(String[] args) {
        String str = "Good Morning123";
        System.out.println(removeDigits(str));
        System.out.println(removeAllDigits(str));


    }
}
