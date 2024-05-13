package com.java.interviewprograms;

public class SumOfDigitsInANumber {

    public void sumOfDigits(){
        int num = 1234567;
        int sum = 0;

        while (num>0){
            sum = sum+num%10;
            num = num/10;
        }
        System.out.println("The sum of the digits in the number is "+sum);
    }

    public static void main(String[] args) {
        SumOfDigitsInANumber sumOfDigitsInANumber = new SumOfDigitsInANumber();
        sumOfDigitsInANumber.sumOfDigits();
    }
}
