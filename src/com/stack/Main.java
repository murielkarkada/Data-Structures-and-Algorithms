package com.stack;

public class Main {
    public static void main(String[] args)
    {
        Stack stack = new Stack( 2 );

        System.out.println("--------------Push-Elements-------------------");
        stack.push( 10 );
        stack.push( 20 );
        stack.push( 30 );
        stack.print();

        System.out.println("----------Searching-Elements-------------------");
        stack.search( 20 );

        System.out.println("---------------Pop-Elements-------------------");
        stack.pop();
        stack.print();
        System.out.println("----------------------------------------------");
        System.out.println("Popping all elements");
        stack.pop();
        stack.pop();
        System.out.println("----------Trying-to-pop-from-empty-stack-------");

        stack.pop();
        stack.print();
    }
}
