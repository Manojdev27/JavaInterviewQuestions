package com.java.interviewprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateInAnArray {

    public void findDuplicate(String[] strArray){

        boolean flag = false;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i+1; j < strArray.length; j++) {
                if (strArray[i]==strArray[j]){
                    System.out.println("Found Duplicate Element is: "+strArray[i]);
                    flag = true;
                }
            }
            
        }
        if (flag==false){
            System.out.println("Duplicate Element Not Found");
        }
    }

    public void findDuplicateUsingSet(String[] string){
        HashSet<String> hashSet = new HashSet<String>();
        boolean flag = false;
        for(String value:string){
            if(hashSet.add(value)==false){
                System.out.println("Found Duplicate Element:" +value);
                flag=true;
            }

        }
        if(flag==false){
            System.out.println("Duplicate Element Not Found");
        }
    }
    public static void main(String[] args) {
        String [] strings = {"Java", "C++","Python","Java","Go","Ruby"};
        FindDuplicateInAnArray findDuplicateInAnArray = new FindDuplicateInAnArray();
        findDuplicateInAnArray.findDuplicate(strings);
        findDuplicateInAnArray.findDuplicateUsingSet(strings);
    }
}
