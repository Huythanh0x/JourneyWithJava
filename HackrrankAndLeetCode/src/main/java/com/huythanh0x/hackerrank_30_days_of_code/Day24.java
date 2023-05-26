package com.huythanh0x.hackerrank_30_days_of_code;

import java.util.Scanner;


class DuplicatedNode {
    int data;
    DuplicatedNode next;

    DuplicatedNode(int d) {
        data = d;
        next = null;
    }
}

class Day24 {

    public static DuplicatedNode removeDuplicates(DuplicatedNode head) {
        if (head == null) return null;
        DuplicatedNode travelNode = head;
        while (travelNode!= null && travelNode.next != null) {
            while (isDuplicated(travelNode)) {
                removeCurrentNode(travelNode);
            }
            travelNode = travelNode.next;
        }
        return head;

    }

    public static boolean isDuplicated(DuplicatedNode cur) {
        int checkValue = cur.data;
        cur = cur.next;
        while (cur != null) {
            if (cur.data == checkValue) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public static void removeCurrentNode(DuplicatedNode cur) {
        if (cur != null && cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    public static DuplicatedNode insert(DuplicatedNode head, int data) {
        DuplicatedNode p = new DuplicatedNode(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            DuplicatedNode start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(DuplicatedNode head) {
        DuplicatedNode start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DuplicatedNode head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}