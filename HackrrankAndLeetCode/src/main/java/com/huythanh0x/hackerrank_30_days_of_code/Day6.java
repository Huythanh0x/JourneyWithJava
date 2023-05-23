package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Day6 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfInput = 0;
        try {
            numberOfInput = Integer.parseInt(bufferedReader.readLine().trim());
            for (int i = 0; i < numberOfInput; i++) {
                String inputString = bufferedReader.readLine().trim();
                StringBuilder charsAtEvenIndexBuilder = new StringBuilder();
                StringBuilder charsAtOddIndexBuilder = new StringBuilder();
                for (int charIndex = 0; charIndex < inputString.length(); charIndex++) {
                    if (charIndex % 2 == 0) {
                        charsAtEvenIndexBuilder.append(inputString.charAt(charIndex));
                    } else {
                        charsAtOddIndexBuilder.append(inputString.charAt(charIndex));
                    }
                }
                System.out.print(charsAtEvenIndexBuilder);
                System.out.print(" ");
                System.out.println(charsAtOddIndexBuilder);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}