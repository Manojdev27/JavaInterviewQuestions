package com.java.interviewprograms;

public class SumOfArray {

    //Method 1
    public void sumOfArray(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements in the array: "+sum);
    }

    //Method 2
    public void sumOfArrayUsingForEach(int[] arr1){
        int sum = 0;

        for (int value: arr1){
            sum = sum + value;
        }
        System.out.println("Sum of elements in the array: "+sum);
    }

    public static void main(String[] args) {
        int a[] = {20,30,40,50,60};
        SumOfArray sumOfArray = new SumOfArray();
        sumOfArray.sumOfArray(a);
        sumOfArray.sumOfArrayUsingForEach(a);
    }
}
