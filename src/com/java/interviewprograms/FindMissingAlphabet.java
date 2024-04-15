package com.java.interviewprograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabet {

    public static void main(String[] args) {

            String str = "Hermione";
            String[] input = str.toLowerCase().replaceAll(" ", "")
                    .split("");

            System.out.println(str);
            String[] pangram = "The quick brown fox jumps over the lazy dog".toLowerCase()
                    .replaceAll(" ", "")
                    .split("");
            HashSet<String> hashSet = new HashSet<>(Arrays.asList(input));
            HashSet<String> hashSet2 = new HashSet<>(Arrays.asList(pangram));
            hashSet2.removeAll(hashSet);
            System.out.println(hashSet2);


    }
}
