package com.gaurav.ghati;

public class Main {


    public static void main(String[] args){
        LinkedList cinema = new Queue();

        ((Queue) cinema).insertAtTail(23);
        cinema.display();

        ((Queue) cinema).insertAtTail(45);
        cinema.display();

        ((Queue) cinema).insertAtTail(69);
        cinema.display();

        ((Queue) cinema).insertAtTail(33);
        cinema.display();

        ((Queue) cinema).insertAtTail(44);
        cinema.display();

        cinema.pop();
        cinema.display();

        cinema.deletionAtTail();
        cinema.display();

        cinema.remove(69);
        cinema.display();

        cinema.removePos(1);
        cinema.display();

        System.out.println("********************************************************************");

        LinkedList diskStore = new Stack();

        ((Stack) diskStore).push(34);
        diskStore.display();

        ((Stack) diskStore).push(45);
        diskStore.display();

        ((Stack) diskStore).push(56);
        diskStore.display();

        ((Stack) diskStore).push(367);
        diskStore.display();

        ((Stack) diskStore).push(378);
        diskStore.display();

        ((Stack) diskStore).push(56);
        diskStore.display();

         diskStore.pop();
         diskStore.display();

         diskStore.deletionAtTail();
         diskStore.display();

         diskStore.removePos(1);
         diskStore.display();

         diskStore.remove(367);



    }


}
