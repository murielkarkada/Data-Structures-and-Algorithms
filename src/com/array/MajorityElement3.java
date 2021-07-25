package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MajorityElement3 {

    public static ArrayList<Integer> findFrequency(int[] inputArray, int k)
    {
        HashMap<Integer,Integer> map = new HashMap <>();
        int limit = inputArray.length/k;
        ArrayList<Integer> result = new ArrayList <>();

        //Add all the elements and their frequency to map
        for (int i = 0; i< inputArray.length; i++)
        {
            /* add the array element as key, the frequency as value;
            If the elemnt is already present increase the frequency
            getOrDefault function returns the value f present else returns default i.e.,0 */
            map.put( inputArray[i] , map.getOrDefault(inputArray[i],0)+1 );
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > limit)
                result.add( entry.getKey() );
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1,2,1,3,4,4,3,4,2,2};
        int k=1;

        ArrayList<Integer> result = findFrequency( inputArray,k );

        if(!result.isEmpty())
            System.out.println("Frequency : " + result);
        else
            System.out.println("No Element appears n/k times ");

    }
}
