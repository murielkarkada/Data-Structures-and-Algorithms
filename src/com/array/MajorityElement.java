package com.array;

public class MajorityElement {
    private static int findCandidate(int[] nums) {
       // Finding the majority Candidate
        int i, count = 0, currentElement = 0;
        for (i = 0; i < nums.length; i++)
        {
            //if the count is 0, set the candidate to current element at i
            if (count == 0)
            {
                currentElement = nums[i];
            }

            //If current element is equal to next element increase the count by 1, else decrease by 1
            if(currentElement == nums[i])
            {
                count++;
            }
            else count--;
          //  n += (curr == nums[i]) ? 1 : -1;
        }
        return currentElement;
    }

    //Verify if the candidate count is more than n/2 then return the element
    private static int verifyCandidate(int[] array, int candidate) {
        int count = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == candidate)
                count++;
        }

        if ( count > (array.length/2))
            return candidate;

        return -1;
    }

    private static int majorityElement(int[] array)
    {
        int candidate = findCandidate( array );
        int majorityElement = verifyCandidate(array, candidate);

        return majorityElement;
    }


    public static void main(String[] args) {
        int inputArray[] = {1,3,20,20,20,1,2,3,5,6};

        int result = majorityElement( inputArray );

        if(result != -1)
            System.out.println("The majority element is : [ " + result + "]");
        else
            System.out.println("Majority element is not found");
    }
}
