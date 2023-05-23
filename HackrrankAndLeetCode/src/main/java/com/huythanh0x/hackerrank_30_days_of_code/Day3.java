package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt(bufferedReader.readLine().trim());
        if(inputNumber % 2 == 1){
            System.out.print("Weird");
        }else if(inputNumber % 2 == 0 && inputNumber >=2 && inputNumber <= 5){
            System.out.print("Not Weird");
        }else if (inputNumber >= 6 && inputNumber <= 20){
            System.out.print("Weird");
        }else {
            System.out.print("Not Weird");
        }

        bufferedReader.close();

    }
}