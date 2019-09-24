package com.gaurav.ghati;

public class Queue extends LinkedList {
    @Override
    public void pop() {                       //deletion from beg
        super.pop();
        System.out.println("Queue deletion!!");
    }

    public void insertAtTail(int data){

        Node newNode = new Node(data);
        Node temp = head;

        if(head==null){
            head = newNode;
        }
        else if(head.next==null){
            head.next = newNode;
        }else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
        System.out.println("Queue Insertion!!");
    }
}
