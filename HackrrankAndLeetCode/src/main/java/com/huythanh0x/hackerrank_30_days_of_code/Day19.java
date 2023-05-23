package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator19 implements AdvancedArithmetic {
    int divisorSum = 0;

    public int divisorSum(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorSum += i;
            }
        }
        return divisorSum;
    }
}

class Day19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator19();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}