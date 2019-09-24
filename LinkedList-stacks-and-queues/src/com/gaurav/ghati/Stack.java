package com.gaurav.ghati;

public class Stack extends LinkedList {
    public void push(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Stack Insertion!!");
    }

    @Override
    public void pop() {                             //deletion from beg
        super.pop();
        System.out.println("Stack Deletion!!");
    }
}
