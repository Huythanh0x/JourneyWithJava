package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.*;
import java.util.stream.IntStream;

class ResultBitWise {
    public static int bitwiseAnd(int N, int K) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if ((i & j) >= maxValue && (i & j) < K) {
                    maxValue = i & j;
                }
            }
        }
        return maxValue;
    }
}

class Day29 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = ResultBitWise.bitwiseAnd(count, lim);
                System.out.println(res);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}