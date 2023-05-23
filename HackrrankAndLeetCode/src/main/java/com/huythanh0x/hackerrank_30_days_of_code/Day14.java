package com.huythanh0x.hackerrank_30_days_of_code;

import java.util.Scanner;

class Difference {
    private final int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] a) {
        this.elements = a;
    }

    public int computeDifference() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int e : elements) {
            if (e > max) max = e;
            if (e < min) min = e;
        }
        maximumDifference = max - min;
        return maximumDifference;
    }
}

class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}