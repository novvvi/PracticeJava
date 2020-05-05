package com.dojo;

public class DLL {
    public Node head;
    public Node tail;
    public int count;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    // the push method will add a new node to the end of the list
    public void push(Node newNode) {


        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            count ++;
            return;
        }

        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
        count ++;
    }

    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;

        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }

    public void printValuesBackward() {
        Node current = this.tail;

        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.previous;
        }
    }

    public Node pop() {
        Node current = this.tail;
        current.previous.next = null;
        this.tail = current.previous;
        count --;
        return current;
    }

    public boolean contains(Integer value) {
        Node current = this.head;

        // while the current node exists...
        while(current != null) {
            // print it's value
            if(current.value == value){
                return true;
            };
            // and move on to it's next node.
            current = current.next;
        }
        return false;
    }

    public int size() {
        return count;
    }

    public void insertAt(Node newNode, int index) {
        if (count >= index + 1) {
            Node head = this.head;
            for(int i = 0 ; i < index - 1 ; i++) {
                head = head.next;
            }
            Node next = head.next;
            next.previous = newNode;
            head.next = newNode;
            newNode.previous = head;
            newNode.next = next;
            count ++;


        }
    }
}
