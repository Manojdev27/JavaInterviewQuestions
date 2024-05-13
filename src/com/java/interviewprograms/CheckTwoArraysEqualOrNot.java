package com.java.interviewprograms;

import java.util.Arrays;

public class CheckTwoArraysEqualOrNot {

    public void checkArraysAreEqual(int[] arr1, int[] arr2){

        boolean status = Arrays.equals(arr1,arr2);
        if(status==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are Not Equal");
        }
    }

public void checkEqualArrays(int[] arr1, int[] arr2){
        boolean status = true;
        if(arr1.length==arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    status = false;
                }
            }
        }
            else{
                status = false;
            }

            if (status==true){
                System.out.println("Arrays are Equal");
            }
            else {
                System.out.println("Arrays are not Equal");
            }
}

    public static void main(String[] args) {
        int a[] ={10,20,30,40,50};
        int b[] = {10,20,30,40,50};
        int c[] ={10,20,30,4,5};
        CheckTwoArraysEqualOrNot checkTwoArraysEqualOrNot = new CheckTwoArraysEqualOrNot();
        checkTwoArraysEqualOrNot.checkArraysAreEqual(a,b);
        checkTwoArraysEqualOrNot.checkArraysAreEqual(a,c);
        checkTwoArraysEqualOrNot.checkEqualArrays(a,b);
        checkTwoArraysEqualOrNot.checkEqualArrays(a,c);
    }
}
