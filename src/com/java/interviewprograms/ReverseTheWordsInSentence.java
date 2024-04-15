package com.java.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseTheWordsInSentence {


    public void usingRegex(){
        String str =  "Harry James Potter";
        String reversed = "";
        String [] temp = str.split(" ");
        System.out.println(temp.length);

        for(int i =temp.length-1;i>=0;i--){
            reversed = reversed+temp[i]+" ";

        }
        System.out.print(reversed);
        System.out.println();
    }

    public void usingCollections(){
        String str =  "Harry James Potter";
        String [] temp = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String words:temp){
//            System.out.println(words);
            list.add(words);
        }
        Collections.reverse(list);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
    }
    public static void main(String[] args) {

        ReverseTheWordsInSentence reverseTheWordsInSentence = new ReverseTheWordsInSentence();
        reverseTheWordsInSentence.usingRegex();
        reverseTheWordsInSentence.usingCollections();


    }
}
