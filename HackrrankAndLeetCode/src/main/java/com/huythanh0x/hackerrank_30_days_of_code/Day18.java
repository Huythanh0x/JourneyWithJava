package com.huythanh0x.hackerrank_30_days_of_code;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Day18 {
    ArrayList<String> queue = new ArrayList<>();
    ArrayList<String> stack = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (!Objects.equals(p.popCharacter(), p.dequeueCharacter())) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    private String popCharacter() {
        String popElement = stack.get(0);
        stack.remove(0);
        return popElement;
    }

    private String dequeueCharacter() {
        String dequeueElement = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return dequeueElement;
    }

    private void pushCharacter(char c) {
        stack.add(String.valueOf(c));
    }

    private void enqueueCharacter(char c) {
        queue.add(String.valueOf(c));
    }

}