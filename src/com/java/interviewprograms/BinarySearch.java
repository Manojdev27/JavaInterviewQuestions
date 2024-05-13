package com.java.interviewprograms;

import java.util.Arrays;

public class BinarySearch {

    // Method 1
    public void binarySearch(int[] arr, int key){

        int low = 0;
        int high = arr.length-1;
        boolean flag = false;
        while (low <= high){
            int middle = (low+high)/2;
            if(arr[middle] == key){
                System.out.println("Element Found");
                flag = true;
                break;
            }
            if (arr[middle]< key){
                low = middle+1;
            }
            if (arr[middle] > key){
                high = middle-1;
            }

        }
        if (flag == false){
            System.out.println("Element not found...");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60,70,80,90,100};
        int x = 90;
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(arr1,x);
        // Method 2
        System.out.println(Arrays.binarySearch(arr1, x));// returns the index of the found element

    }
}
