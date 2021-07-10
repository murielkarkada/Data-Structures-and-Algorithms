package com.stack;

public class Stack {
    private int[] stack;
    private int head;

    public Stack(int size) {
        stack = new int[size];
    }

    public void push(int element) {
        if (head == stack.length) {
            int[] newStack = new int[head * 2];

            for (int i = 0; i < head; i++)
                newStack[i] = stack[i];
            stack = newStack;
        }

        stack[head++] = element;
    }

    public void print() {
        for (int i = 0; i < head; i++)
            System.out.println( stack[i] );
    }

    public void pop() {
        if (head == 0)
            throw new UnsupportedOperationException( "Stack is empty" );

        head--;
    }

    public int search(int element) {
        for (int i = 0; i <= head; i++) {
            if (stack[i] == element) {
                System.out.println( element + " is found at position " + i );
                return 1;
            }
        }
        System.out.println( element + " is not found" );
        return -1;
    }
}

