package com.huythanh0x.hackerrank_30_days_of_code;

import java.util.Scanner;

class Day1 {
    public static void main(String[] args) {
        Integer i = 4;
        Double d = 4.0;
        String s = "HackerRank";
        Scanner scanner = new Scanner(System.in);
        Integer intInput = Integer.parseInt(scanner.nextLine());
        Double doubleInput = Double.parseDouble(scanner.nextLine());
        String stringInput = scanner.nextLine();
        System.out.println(i + intInput);
        System.out.println(d + doubleInput);
        System.out.println(s + " " +  stringInput);
    }
}