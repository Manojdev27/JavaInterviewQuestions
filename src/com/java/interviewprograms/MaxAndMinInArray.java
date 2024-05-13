package com.java.interviewprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxAndMinInArray {

    public int maxInArray(int arr[]){
//        int[] arr = {50,100,25,45,67,89,97};
        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
return max;

    }
    public int minInArray(int arr[]){
//        int[] arr = {50,100,25,45,67,89,97};
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    // Method 2
    public int maxInArray2(int[] arr){
//        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,0};
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;

    }

    public int minInArray2(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <smallest){
                smallest = arr[i];
            }

        }
       return smallest;
    }

    // Method 3

    public int findingMinUsingArrays(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public int findingMaxUsingArrays(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // Method 4
    Integer [] arr = {100,10,20,30,50,15};
    //using Collections
    public void findingMinUsingCollections(){
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int smallest = list.get(0);
        System.out.println("The Min Value is "+smallest);

    }

    public void findingMaxUsingCollections(){
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int largest = list.get(list.size()-1);
        System.out.println("The Max Value is "+largest);

    }

    // Method 5
    public int findingMaxUsingStream(int[] arr){
       int max = Arrays.stream(arr).max().getAsInt();
       return max;
    }

    public int findingMinUsingStream(int[] arr){
        int min = Arrays.stream(arr).min().getAsInt();
        return min;
    }
    public static void main(String[] args) {
        MaxAndMinInArray maxAndMinInArray = new MaxAndMinInArray();
        int [] a = {50,100,25,45,67,89,97};
        System.out.println("The Max Value is "+ maxAndMinInArray.maxInArray(a));//100
        System.out.println("The Min Value is "+maxAndMinInArray.minInArray(a));//25
        System.out.println("The Max Value is "+maxAndMinInArray.maxInArray2(a));//100
        System.out.println("The Min Value is "+maxAndMinInArray.minInArray2(a));//25
        System.out.println("The Max Value is "+maxAndMinInArray.findingMaxUsingArrays(a));//100
        System.out.println("The Min Value is "+maxAndMinInArray.findingMinUsingArrays(a));//25
        maxAndMinInArray.findingMinUsingCollections();//10
        maxAndMinInArray.findingMaxUsingCollections();//100
        System.out.println("The Max Value is "+maxAndMinInArray.findingMaxUsingStream(a));
        System.out.println("The Min Value is "+maxAndMinInArray.findingMinUsingArrays(a));


    }
}
