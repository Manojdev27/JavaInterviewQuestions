package com.java.interviewprograms;

import java.util.Scanner;

public class TrianglePattern {

    public void rightAngleTrianglePattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int numberOfLines = scanner.nextInt();
        int row,column = 0;
        for(row=0;row<numberOfLines;row++){
            for(column=0;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void inverseTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int numberOfLines = scanner.nextInt();
        int row,column = 0;
        for (row=1;row<=numberOfLines;row++){
            for (column=numberOfLines; column>=row;column--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void numberTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int num = 1;
        int limit;
        limit = scanner.nextInt();
        int row, column;
        for (row = 0; row <limit; row++) {
            for (column = 0; column<= row; column++){
                System.out.print(num+ " ");
                num = num+1;
            }
            System.out.println();
        }
    }

    public void pyramidPattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int numberOfLines = scanner.nextInt();
        int row,column;
        for(row =0; row<numberOfLines;row++){
            for(column=numberOfLines-row;column>1;column--){
                System.out.print(" ");
            }
            for (column = 0; column <=row ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     TrianglePattern trianglePattern = new TrianglePattern();
     trianglePattern.rightAngleTrianglePattern();
     trianglePattern.inverseTriangle();
     trianglePattern.numberTriangle();
     trianglePattern.pyramidPattern();
    }
}
