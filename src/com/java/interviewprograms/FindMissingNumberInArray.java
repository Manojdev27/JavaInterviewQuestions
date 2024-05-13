package com.java.interviewprograms;

public class FindMissingNumberInArray {

    public void missingNumberInArray(int[] arr){
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1+arr[i];
        }
        System.out.println("Sum of Elements in an Array: "+sum1);

        int sum2 = 0;
        for (int j = 0; j <=10; j++) {
            sum2 = sum2+j;
        }
        System.out.println("Sum of range of Elements in an Array: "+sum2);

        System.out.println("The Missing Number is: "+(sum2-sum1));

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,7,8,9,10};
        FindMissingNumberInArray findMissingNumberInArray = new FindMissingNumberInArray();
        findMissingNumberInArray.missingNumberInArray(a);
    }
}
