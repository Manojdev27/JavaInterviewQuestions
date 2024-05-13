package com.java.interviewprograms;

import java.util.Scanner;

public class PrimeOrNot {

    public void primeOrNot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int count = 0;
        if(num > 1) {

            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        }
        else {
            System.out.println("Not prime number");
        }
    }
    public static void main(String[] args) {
PrimeOrNot primeOrNot = new PrimeOrNot();
primeOrNot.primeOrNot();
    }
}
