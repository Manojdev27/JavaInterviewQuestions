package com.java.interviewprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {

    public void commonElements(int[] arr1, int[] arr2){
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[i]){
                    integerSet.add(arr1[i]);
                    break;
                }
            }
        }
        for (int i:integerSet) {
            System.out.println(i+ " ");
        }
    }

    public void FindCommonElements(int[] arr1,int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i:arr1){
            set1.add(i);
        }
        for (int i:arr2){
            set2.add(i);
        }
        set1.retainAll(set2);

        System.out.println("Common Elements: "+set1);

    }
    public static void main(String[] args) {
        int[] arr1 = {12,30,14,58,76,74,84,83};
        int[] arr2 = {12,31,15,58,76,78,84,82};
        System.out.println("Array 1:" + Arrays.toString(arr1));
        System.out.println("Array 2:" + Arrays.toString(arr2));
       CommonElementsInArray commonElementsInArray = new CommonElementsInArray();
//       commonElementsInArray.commonElements(arr1,arr2);
        commonElementsInArray.FindCommonElements(arr1,arr2);
    }
}
