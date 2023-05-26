package com.huythanh0x.hackerrank_30_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class NodeTravel {
    NodeTravel left, right;
    int data;

    NodeTravel(int data) {
        this.data = data;
        left = right = null;
    }
}

class Day23 {

    public static NodeTravel insert(NodeTravel root, int data) {
        if (root == null) {
            return new NodeTravel(data);
        } else {
            NodeTravel cur;
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

    static void levelOrder(NodeTravel root) {
        if (root == null) {
            return;
        }
        Queue<NodeTravel> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            NodeTravel current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        NodeTravel root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}