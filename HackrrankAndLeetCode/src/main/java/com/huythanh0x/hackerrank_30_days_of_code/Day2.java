package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Result {
    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        long result = Math.round(mealCost * (100 + tipPercent + taxPercent) / 100);
        System.out.println(result);
    }

}


class Day2 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = 0;
        try {
            meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
            int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

            int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

            Result.solve(meal_cost, tip_percent, tax_percent);

            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}