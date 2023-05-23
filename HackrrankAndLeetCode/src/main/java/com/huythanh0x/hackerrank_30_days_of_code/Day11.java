package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;


class Day11 {
    static int getMaxHourGlass(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 6 - 2; i++) {
            for (int j = 0; j < 6 - 2; j++) {
                int sum = (
                        arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                                arr[i + 1][j + 1] +
                                arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
                );
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(getMaxHourGlass(arr));
        scanner.close();
    }
}