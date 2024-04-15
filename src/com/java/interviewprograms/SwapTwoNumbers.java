package com.java.interviewprograms;

public class SwapTwoNumbers {
    int a = 50;
    int b = 100;

    public void usingTempVariable(){
        System.out.println("Before Swapping "+" a: " + a);
        System.out.println("Before Swapping "+" b: " +b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping "+" a: " + a);
        System.out.println("After Swapping "+" b: " +b);
    }

    public void usingArithmetic(){
        System.out.println("Before Swapping "+" a: " + a);
        System.out.println("Before Swapping "+" b: " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        //another method
//        a = a-b;
//        b = a+b;
//        a = b-a;
        System.out.println("After Swapping "+" a: " + a);
        System.out.println("After Swapping "+" b: " +b);

    }
    public void singleStatement(){
        System.out.println("Before Swapping "+" a: " + a);
        System.out.println("Before Swapping "+" b: " +b);
        b = a+b - (a=b);
        System.out.println("After Swapping "+" a: " + a);
        System.out.println("After Swapping "+" b: " +b);
    }
    public static void main(String[] args) {

       SwapTwoNumbers swapTwoNumbers =  new SwapTwoNumbers();
//       swapTwoNumbers.usingTempVariable();
//       swapTwoNumbers.usingArithmetic();
        swapTwoNumbers.singleStatement();

    }


}
