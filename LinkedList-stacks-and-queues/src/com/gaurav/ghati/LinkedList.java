package com.gaurav.ghati;

public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    protected Node head;

    //stack and queue deletion  //deletion from begening
    public void pop(){
        head = head.next;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void deletionAtTail(){
        Node temp = head;
        Node prev = null;
        System.out.println("Deletion from Tail : ");
        if(temp == null){
            System.out.print("Empty List");
        }
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }


    ///////////////////////////////////////////////////////////////////////////////////
    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("Empty LInkedList");
        }
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.println();
        System.out.println();
    }

    ///////////////////////////////////////////////////////////////////////////////////
    public void remove(int key){
        System.out.println("Removal of "+key+" from linkedList");
        Node temp = head;
        Node prev = null;
        while(temp!=null && temp.data!=key) {
            prev = temp;
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Element not Found!");
            return;
        }
        prev.next = temp.next;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    public void removePos(int pos){
        System.out.println("Removal from position :"+pos+" from linkedList");
        Node temp = head;
        Node prev = null;
        int tag = 0;

        if(temp==null) {
            return;
        }else{
            while(temp.next!=null && tag!=pos){
                prev = temp;
                temp = temp.next;
                tag++;
            }
            prev.next = temp.next;
        }
    }


}
