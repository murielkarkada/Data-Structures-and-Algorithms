package com.array;

/*Largest Sum Contiguous Subarray
Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.
        Kadane’s Algorithm:

        Initialize:
        max_so_far = INT_MIN
        max_ending_here = 0

        Loop for each element of the array
        (a) max_ending_here = max_ending_here + a[i]
        (b) if(max_so_far < max_ending_here)
        max_so_far = max_ending_here
        (c) if(max_ending_here < 0)
        max_ending_here = 0
        return max_so_far
        Explanation:
        The simple idea of Kadane’s algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this).
        And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this).
        Each time we get a positive-sum compare it with max_so_far and update max_so_far if it is greater than max_so_far*/

public class Kadane {
    public static void main(String[] args) {
        int inputArray[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        System.out.println("Maximum sum of a a subArray is: [" + maximumSum(inputArray) + "]");
    }

    private static int maximumSum(int[] inputArray) {
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;

        for(int i = 0; i<inputArray.length; i++)
        {
            max_ending_here = max_ending_here + inputArray[i];

            if(max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
            }

            if(max_ending_here < 0)
            {
                max_ending_here = 0;
            }
        }

        return max_so_far;
    }
}
