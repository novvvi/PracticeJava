package com.dojo;

public class Node {
    public int value;
    public Node previous;
    public Node next;

    public Node(int val) {
        value = val;
        previous = null;
        next = null;
    }

}
