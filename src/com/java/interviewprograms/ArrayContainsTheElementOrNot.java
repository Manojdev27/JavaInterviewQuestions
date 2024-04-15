package com.java.interviewprograms;

import java.util.stream.IntStream;

public class ArrayContainsTheElementOrNot {

    int[] array = {1,2,3,4,5,7,8,9};
    int numToFind = 4;
    boolean found = false;

    public void numPresentOrNot(){
        for(int num:array){
            if(num == numToFind){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Number is present");
        }
        else{
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
        ArrayContainsTheElementOrNot arrayContainsTheElementOrNot = new ArrayContainsTheElementOrNot();
        arrayContainsTheElementOrNot.numPresentOrNot();
        arrayContainsTheElementOrNot.usingIntStream();
    }
}
