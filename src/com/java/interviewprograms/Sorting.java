package com.java.interviewprograms;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    public void sort(Integer[] arr){

        System.out.println("Elements Before Sorting: "+ Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println("Elements After Sorting using parallel sort: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Elements After Sorting: "+ Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Elements After Sorting in descending order: "+ Arrays.toString(arr));

    }
    public static void main(String[] args) {
        Integer[] arr1= { 64, 34, 25, 12, 22, 11, 90 };
        Sorting sorting = new Sorting();
        sorting.sort(arr1);
    }
}
