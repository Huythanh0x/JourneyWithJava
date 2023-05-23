package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Person {
    Integer initialAge = 0;

    Person(Integer initialAge) {
        if (initialAge < 0) {
            this.initialAge = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.initialAge = initialAge;
        }
    }

    void yearPasses() {
        this.initialAge++;
    }

    void amIOld() {
        if (this.initialAge < 13) {
            System.out.println("You are young.");
        } else if (initialAge < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}

class Day4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}