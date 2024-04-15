package com.java.interviewprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheSmallestNumber {

    // Find the Maximum Element in an Array
    Integer[] arr = {1,2,3,4,5,6,7,8,9,10,0};
    public void findSmallest(){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <smallest){
                smallest = arr[i];
            }

        }
        System.out.println("Smallest Number in the array is: " +smallest);
    }

    //using Arrays
    public void usingArrays(){
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
    //using Collections
    public void usingCollections(){
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int smallest = list.get(0);
        System.out.println(smallest);

    }
    public static void main(String[] args) {

        FindTheSmallestNumber findTheSmallestNumber = new FindTheSmallestNumber();
        findTheSmallestNumber.findSmallest();
        findTheSmallestNumber.usingArrays();
        findTheSmallestNumber.usingCollections();
    }
}
