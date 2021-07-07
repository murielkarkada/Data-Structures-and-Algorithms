package com.array;

public class Array {
    private int count;
    private int[] array;

    public Array(int length)
    {
        array = new int[length];
    }

    public void print()
    {
        for(int index = 0; index < count; index++)
            System.out.println(array[index]);
    }

    public void insert(int newElement){
        //check if the array is full
        if (count == array.length)
        {
            int[] newArray = new int[count*2];

            for (int index = 0; index < count; index++)
                newArray[index] = array[index];

            array = newArray;
        }

        //adding array to the next index
        array[count++] = newElement;
    }

   public void remove(int index)
   {
       if(index<0 || index>count )
           throw new IllegalArgumentException("Invalid index");

       array[index] = array[++index];
       count--;
   }

   public int search(int element)
   {
       for (int i =0; i< count; i++)

           if(array[i] == element) {
               System.out.println(element + " is found");
               return 1;
           }
           return -1;
   }


}
