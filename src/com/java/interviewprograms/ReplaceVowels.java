package com.java.interviewprograms;

public class ReplaceVowels {

    public void usingLoops(){
        String name = "Emma Watson";
        char[] charArray = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'a'
                    || name.charAt(i) == 'e'
                    || name.charAt(i) == 'i'
                    || name.charAt(i) == 'o'
                    ||name.charAt(i) == 'u'
                    ||name.charAt(i) == 'A'
                    ||name.charAt(i) == 'E'
                    ||name.charAt(i) == 'I'
                    ||name.charAt(i) == 'O'
                    ||name.charAt(i) == 'U')
            {
                charArray[i] = '*';
            }
        }
        for (int i = 0; i < name.length(); i++) {
            System.out.print(charArray[i]);
        }

    }

    public void usingRegex(){
        String name = "Emma Watson";
        String replacedText = name.replaceAll("[AEIOUaeiou]","\\$");
        System.out.println(replacedText);
    }
    public static void main(String[] args) {

       ReplaceVowels replaceVowels = new ReplaceVowels();
       replaceVowels.usingLoops();
        System.out.println();
       replaceVowels.usingRegex();
    }
}
