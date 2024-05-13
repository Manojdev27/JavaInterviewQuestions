package com.java.interviewprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

    public void largestOfThree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the Third Number: ");
        int c = scanner.nextInt();

        if (a>b && a>c){
            System.out.println(a+ " is the largest Number");
        } else if (b>a && b>c) {
            System.out.println(b+ " is the largest number");
        }
        else{
            System.out.println(c+" is the largest number");
        }
    }

    public void findLargestUsingTerenery(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the Third Number: ");
        int c = scanner.nextInt();

//        int largest = a>b?a:b;
//        int largestNum = c>largest?c:largest;

        int largest = c > (a>b?a:b) ?c:(a>b?a:b);
        System.out.println(largest+ " is the largest number");

//        System.out.println(largestNum+ " is the largest Number");

    }
    public static void main(String[] args) {
       LargestOfThreeNumbers largestOfThreeNumbers = new LargestOfThreeNumbers();
       largestOfThreeNumbers.largestOfThree();
       largestOfThreeNumbers.findLargestUsingTerenery();
    }

}
