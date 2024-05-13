package com.java.interviewprograms;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.random.RandomGeneratorFactory;

public class GenerateRandomNumbersAndStrings {

    //Method 1
    public void randomNumber(){
        Random random = new Random();
        int randomInt = random.nextInt(1000);
        Double randomDouble = random.nextDouble();
        System.out.println(randomInt);
        System.out.println(randomDouble);
        System.out.println(Math.random());
    }


    public static void main(String[] args) {
        GenerateRandomNumbersAndStrings generateRandomNumbersAndStrings = new GenerateRandomNumbersAndStrings();
        generateRandomNumbersAndStrings.randomNumber();
        String randomNumber = RandomStringUtils.randomNumeric(5);
        System.out.println(randomNumber);
        String randomStr = RandomStringUtils.randomAlphanumeric(5);
        System.out.println(randomStr);

    }
}
