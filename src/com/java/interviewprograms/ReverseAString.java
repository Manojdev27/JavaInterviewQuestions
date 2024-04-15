package com.java.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

    String string = "Harry";
    public void usingStringBuffer(){
        // using StringBuffer reverse method
        StringBuffer buffer = new StringBuffer();
        buffer.append(string);
        System.out.println(buffer.reverse());
    }

    public void usingToCharArray(){
        // using toCharArray
        char[] charArray = string.toCharArray();
        String reversed = "";
        for (int i = charArray.length-1; i>=0 ; i--) {
            reversed = reversed+charArray[i];
        }
        System.out.println(reversed);
    }

    public void usingCollections(){
        char[] charArray =string.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (Character character:charArray){
            list.add(character);

        }
        Collections.reverse(list);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
    public static void main(String[] args) {
        ReverseAString reverseAString = new ReverseAString();
        reverseAString.usingStringBuffer();
        reverseAString.usingToCharArray();
        reverseAString.usingCollections();

    }


}
