package com.array;

public class Main {

    public static void main(String[] args){
	// write your code here
        Array array = new Array(2);

        array.insert( 10 );
        array.insert( 20 );
        array.insert( 30 );
        array.remove( 2 );
        array.search( 20 );
        array.print();
    }
}
