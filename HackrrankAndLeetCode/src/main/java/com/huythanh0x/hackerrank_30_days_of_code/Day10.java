package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        StringBuilder stringBuilder = new StringBuilder();
        while (n >= 1) {
            if (n % 2 == 0) {
                stringBuilder.insert(0, 0);
            } else {
                stringBuilder.insert(0, 1);
            }
            n /= 2;
        }
        int maxConsective = stringBuilder.length();
        while (maxConsective > 0) {
            if (stringBuilder.toString().contains("1".repeat(maxConsective)))
                break;
            maxConsective -= 1;
        }
        System.out.println(maxConsective);
        bufferedReader.close();
    }
}