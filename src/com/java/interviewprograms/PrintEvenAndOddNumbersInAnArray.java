package com.java.interviewprograms;

public class PrintEvenAndOddNumbersInAnArray {

    public void printEvenAndOdd(int[] arr){

        System.out.println("The Even numbers in an array are: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("The Odd numbers in an array are: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }

    public void printOddAndEvenUsingForEach(int[] arr1){
        System.out.println("The Even numbers in an array are: ");
       for(int value: arr1){
            if(value%2==0){
                System.out.println(value);
            }
        }
        System.out.println("The Odd numbers in an array are: ");
        for(int value: arr1) {
            if(value%2!=0){
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,10,2,20,3,30,4,40,5,50,6,60,7,70,8,80,9,90,10,100};
        PrintEvenAndOddNumbersInAnArray printEvenAndOddNumbersInAnArray = new PrintEvenAndOddNumbersInAnArray();
        printEvenAndOddNumbersInAnArray.printEvenAndOdd(a);
        printEvenAndOddNumbersInAnArray.printOddAndEvenUsingForEach(a);
    }
}
