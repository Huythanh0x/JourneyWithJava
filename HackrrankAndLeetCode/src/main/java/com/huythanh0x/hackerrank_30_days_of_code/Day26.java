package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Day26 {
    static int getFine(int returnedD, int returnedM, int returnedY, int dueD, int dueM, int dueY) {
        if (returnedY > dueY) {
            return 10000;
        } else if (returnedY == dueY && returnedM > dueM) {
            return (returnedM - dueM) * 500;
        } else if (returnedM == dueM && returnedD > dueD) {
            return (returnedD - dueD) * 15;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String returnedDateString = bufferedReader.readLine();
        int returnedD = Integer.parseInt(returnedDateString.split(" ")[0]);
        int returnedM = Integer.parseInt(returnedDateString.split(" ")[1]);
        int returnedY = Integer.parseInt(returnedDateString.split(" ")[2]);

        String dueDateString = bufferedReader.readLine();
        int dueD = Integer.parseInt(dueDateString.split(" ")[0]);
        int dueM = Integer.parseInt(dueDateString.split(" ")[1]);
        int dueY = Integer.parseInt(dueDateString.split(" ")[2]);
        System.out.println(getFine(returnedD, returnedM, returnedY, dueD, dueM, dueY));
        bufferedReader.close();
    }
}