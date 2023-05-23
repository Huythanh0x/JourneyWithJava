package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Day8 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (phoneBook.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }
        in.close();
    }
}