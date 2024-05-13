package com.java.interviewprograms;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int [] arr, int n){
        System.out.println("Arrays Before Sorting: "+ Arrays.toString(arr));
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("Arrays After Sorting: "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = {10,40,60,50,30,90,70,80,20,100};
        int x = a.length;
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(a,x);
    }
}
