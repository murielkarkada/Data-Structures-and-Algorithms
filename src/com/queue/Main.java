package com.queue;

public class Main {
    public static void main(String[] args) {
     Queue queue = new Queue( 2 );

     System.out.println("--------------Add-Elements-------------------");
     queue.enqueue( 10 );
     queue.enqueue( 20 );
     queue.enqueue( 30 );
     queue.print();

     System.out.println("--------------Search-Elements-------------------");
     queue.search( 20 );
     queue.search( 50 );

     System.out.println("--------------Delete-Elements-------------------");
     queue.dequeue();
     System.out.println("**************one-item-deleted******************");
     queue.dequeue();
     queue.dequeue();
     System.out.println("------Trying-to-remove-item-from-empty-queue-----");
     queue.dequeue();
    }
    }
