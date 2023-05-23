package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Person12 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person12(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person12 {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public String calculate() {
        float averageScore = (float) Arrays.stream(testScores).sum() / testScores.length;
        if (averageScore < 40) {
            return "T";
        } else if (averageScore < 55) {
            return "D";
        } else if (averageScore < 70) {
            return "P";
        } else if (averageScore < 80) {
            return "A";
        } else if (averageScore < 90) {
            return "E";
        } else if (averageScore <= 100) {
            return "O";
        }
        return "FFF";
    }
}

class Day12 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}