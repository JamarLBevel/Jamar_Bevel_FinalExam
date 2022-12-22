package com.example.bevel_jamar_finalexalm_barchart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LL {
    class Node {
        String val;
        Node next;

        Node(String val) {
            this.val = val;
        }

        Node(String val, Node nextNode) {
            this.val = val;
            this.next = nextNode;
        }
    }

    int len;
    Node head, tail;

    LL() {
        len = 0;
        head = tail = null;
    }

    public void append(String val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = null;
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;

        }
    }

    public void prepend(String val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteEnd() {
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void deleteStart() {
        head = head.next;
    }

    public void delete(String val) {
        Node temp = head, prev = null;

        if (temp != null && temp.val == val) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.val != val) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;

    }

    public void deleteAll(String val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void getLen() {
        Node temp = head;
        while (temp != null) {
            len += 1;
            temp = temp.next;
        }
        System.out.println(len);
    }

    public void sort() {
        Node cur = head;
        ArrayList<String> list = new ArrayList<>();
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(list);
        Node temp = head;
        for (String s : list) {
            temp.val = s;
            temp = temp.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node cur = head;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void print() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        LL linked_list = new LL();
        String[] A = new String[]{"s00", "4s1", "41s", "s31", "12s", "s14", "s23", "s42"};
        for (String s : A) {
            linked_list.append(s);
        }
        LL linked_list_2 = new LL();
        int i = 0;
        for (String s : A) {
            linked_list_2.append(s);
            System.out.println("index a b " + i);
            i++;
        }
        linked_list_2.sort();
        linked_list_2.print();
        linked_list_2.getLen();

    }
}
