package com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MajorityElement2 {
    public static List <Integer> majorityElement(int[] nums) {
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0,i;

        for(i=0 ; i<nums.length; i++)
        {
            if(num1==nums[i])
                count1++;
            else if(num2==nums[i])
                count2++;
            else if(count1==0)
            {
                num1=nums[i];
                count1++;
            }
            else if(count2==0)
            {
                num2=nums[i];
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }

        }

        List<Integer> result = new ArrayList <>();
        count1=0;
        count2=0;

        for(i =0; i< nums.length; i++)
        {
            if(nums[i]==num1)
                count1++;
            else
            if(nums[i]==num2)
                count2++;
        }

        if(count1>(nums.length/3))
            result.add(num1);
        if(count2>(nums.length/3))
            result.add(num2);

        return result;
    }

    public static void main(String[] args) {
        int inputArray[] = {1,3,20,20,20,1,1,20,5,1};

        List<Integer> result = majorityElement( inputArray );

        if(!result.isEmpty())
            System.out.println("The majority element is : " + result );
        else
            System.out.println("Majority element is not found");
    }
}
