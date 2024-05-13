package com.java.interviewprograms;

public class FactorialOfANumber {

    public void factorial(int n){
        long factorial = 1;

//        for (int i = 1; i <=n; i++) {
//            factorial = factorial*i;
//        }

        // Method 2 - descending order
        for (int i = n; i >=1 ; i--) {
            factorial = factorial*i;
        }
        System.out.println("The factorial of a number: "+factorial);
    }

    public static void main(String[] args) {
        FactorialOfANumber factorialOfANumber = new FactorialOfANumber();
        factorialOfANumber.factorial(10);
    }
}
