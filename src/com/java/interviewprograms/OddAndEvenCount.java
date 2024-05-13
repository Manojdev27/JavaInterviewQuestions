package com.java.interviewprograms;

import java.util.Scanner;

public class OddAndEvenCount {

    public void oddAndEvenCount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while (input>0){
            int remaining = input % 10;

            if(remaining%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            input = input/10;
        }

        System.out.println("The number of odd digits " +oddCount);
        System.out.println("The number of even digits " +evenCount);
    }

    public static void main(String[] args) {
        OddAndEvenCount oddAndEvenCount = new OddAndEvenCount();
        oddAndEvenCount.oddAndEvenCount();

    }
}
