package com.java.interviewprograms;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        // Method 1
        FileReader fileReader = new FileReader("C:\\Users\\Manoj Targaryen\\Downloads\\New Text Document.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;

        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
        bufferedReader.close();

        //Method 2
        File file = new File("C:\\Users\\Manoj Targaryen\\Downloads\\New Text Document.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }



}
