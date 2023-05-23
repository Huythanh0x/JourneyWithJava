package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        try {
            int output = Integer.parseInt(S);
            System.out.println(output);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}