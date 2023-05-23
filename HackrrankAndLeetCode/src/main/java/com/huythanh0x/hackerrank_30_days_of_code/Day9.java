package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.*;

class KeyClass {
    public static int factorial(int n) {
        // Write your code here
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

}

class Day9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = KeyClass.factorial(n);
        System.out.println(result);

        bufferedReader.close();
    }
}