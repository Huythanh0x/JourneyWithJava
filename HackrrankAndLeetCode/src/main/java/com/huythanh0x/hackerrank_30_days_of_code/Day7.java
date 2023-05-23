package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Day7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        for (int idx = arr.size() - 1; idx >= 0; idx--) {
            System.out.print(arr.get(idx) + " ");
        }
        bufferedReader.close();
    }
}