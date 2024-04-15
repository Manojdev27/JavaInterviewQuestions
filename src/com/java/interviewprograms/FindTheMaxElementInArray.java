package com.java.interviewprograms;

import java.util.stream.IntStream;

public class FindTheMaxElementInArray {
    public static void main(String[] args) {
        // Find the Maximum Element in an Array
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,0};
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);

    }
}
