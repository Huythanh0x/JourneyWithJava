package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class NodeTree {
    NodeTree left, right;
    int data;

    NodeTree(int data) {
        this.data = data;
        left = right = null;
    }
}

class Day22 {
    public static int getHeight(NodeTree root) {
        //Write your code here
        if (root.left == null && root.right == null) return 0;
        if (root.left == null) return 1 + getHeight(root.right);
        if (root.right == null) return 1 + getHeight(root.left);
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static NodeTree insert(NodeTree root, int data) {
        if (root == null) {
            return new NodeTree(data);
        } else {
            NodeTree cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        NodeTree root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}