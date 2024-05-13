package com.java.interviewprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\Manoj Targaryen\\Downloads\\New Text Document.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("This a text write method in the document");
        bufferedWriter.write("This a text method in the document");
        System.out.println("Finished!!!!");
        bufferedWriter.close();
    }
}
