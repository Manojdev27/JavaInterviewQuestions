package com.java.interviewprograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class interview {

    public static int findIndex(int[] arr,int t){
        int len = arr.length;
        return IntStream.range(0,len)
                .filter(i->t == arr[i])
                .findFirst().orElse(-1);
    }
    public static void main(String[] args) {
        int [] a ={2,3,5,11,12};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length ; j++) {
                sum = a[i]+a[j];

                if (sum==8){
                    System.out.println("The index of first loop "+findIndex(a,a[i]));
                    System.out.println("Second number index "+findIndex(a,a[j]));
                    System.out.println(sum);
                    break;
                }

            }

        }
        System.out.println(sum);
    }
}
