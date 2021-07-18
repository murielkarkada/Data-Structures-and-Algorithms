package com.array;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int i, count = 0, curr = 0;
        for (i = 0; i < nums.length; i++)
        {
            if (count == 0)
            {
                curr = nums[i];
            }

            if(curr == nums[i])
            {
                count++;
            }
            else count--;
          //  n += (curr == nums[i]) ? 1 : -1;
        }
        return curr;
    }

    public static void main(String[] args) {
        int inputArray[] = {1,3,1,1,1};

        int result = majorityElement( inputArray );

        System.out.println("The majority element is : [ " + result + "]");
    }
}
