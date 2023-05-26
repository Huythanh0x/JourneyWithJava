package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Day28 {
    public static void main(String[] args) throws IOException {
        ArrayList<AbstractMap.SimpleEntry<String, String>> listEmailName = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                listEmailName.add(new AbstractMap.SimpleEntry<>(emailID, firstName));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        List<AbstractMap.SimpleEntry<String, String>> results = listEmailName.stream().filter(data -> data.getKey().contains("@gmail.com")).sorted(java.util.Map.Entry.comparingByValue()).collect(Collectors.toList());
        for (AbstractMap.SimpleEntry<String, String> result : results) {
            System.out.println(result.getValue());
        }

        bufferedReader.close();
    }
}