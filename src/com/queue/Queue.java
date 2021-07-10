package com.queue;

public class Queue {
    private int[] queue;
    private int head;
    private int tail;

    public Queue(int size)
    {
        queue = new int[size];
    }

    public void print()
    {
        for (int i = 0; i<=tail; i++)
            System.out.println(queue[i]);
    }

    public void enqueue(int element)
    {
        if(tail == queue.length)
        {
            int[] newQueue = new int[tail*2];

            for (int i = 0; i<tail; i++)
                newQueue[i] = queue[i];

            queue = newQueue;
        }

        queue[tail++] = element;
    }

    public void dequeue()
    {
        if(head==0)
            throw new UnsupportedOperationException("Queue is empty");

        queue[head] = queue[head++];

    }

    public int search(int element)
    {
        for(int i=0; i<=tail; i++)
        {
            if(queue[i] == element){
                System.out.println(element + " found");
                return 1;
            }
        }
        System.out.println(element + " not found");
        return -1;
    }

}
