package com.java.interviewprograms;

import java.util.stream.IntStream;

public class LinearSearch {

    int[] array = {1,2,3,4,5,7,8,9};
    int numToFind = 4;
    boolean found = false;

    public void linearSearch(int[] arr){

        int search = 50;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==search){
                System.out.println("Element Found: "+arr[i]);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Element Not Found");
        }
    }

    public void numPresentOrNot(){
        for(int num:array){
            if(num == numToFind){
                System.out.println("Number is present: " +num);
                found = true;
                break;
            }
        }
        if(found==false){
            System.out.println("Number Not present");
        }
    }

    public void usingIntStream(){
        boolean found = IntStream.of(array).anyMatch(e->e==numToFind);
        if(found){
            System.out.println("Number is present");
        }
        else {
            System.out.println("Number Not present");
        }
    }
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40,50,60,70,80,90};
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.numPresentOrNot();
        linearSearch.usingIntStream();
        linearSearch.linearSearch(array1);
    }
}
