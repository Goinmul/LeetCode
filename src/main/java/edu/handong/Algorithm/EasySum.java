package edu.handong.Algorithm;

import java.util.HashMap;
import java.util.Map;

public class EasySum {
	
	/* 
	Problem #1 : Two Sum
	difficulty : easy

	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:

	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].

	@Approach
	since there is only one answer set of two integers,
	try every combinations by using two for loops -> time complexity : O(n^2) , space complexity : O(1)
	 
	*/
	public int[] easySum(int[] nums, int target)
	{
		int[] result = new int[2];
        
        if (nums.length > 1)
        {
          for (int i = 0; i< nums.length-1; i++)
          {
              for (int j = i+1; j<nums.length;j++)
              {
                  if (nums[i]+nums[j] == target)
                  {
                      result[0] = i;
                      result[1] = j;
                      return result;
                  }
              }
           }
          System.out.print("haa");
        }
        
        else
        {
            System.out.println("given array elements same or smaller than 1.\n");
        }
        
        return result;
	}
	
	// Candidate solution #1 :
	 
	 class Solution {
     public int[] twoSum(int[] nums, int target) {
    	 
    	// 1 on 1 matching map.
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        
        // iterate as many times as the array length.
        for (int i=0; i < nums.length ; i++) {
        	
        	// here, key becomes the looking number, that would make the target when added with the latter number.
        	// for example, at a case of nums[] = {1, 2, 4, 7} and target = 6,
        	// the map will be added like (target - 1, index), (target - 2, index), (target - 4, index), ...
        	// at the first iteration, since m contains no element, its first element will be (6-1, 0).
        	// now, from the second iteration, we will look for a number, which you could make the target when added with m's key.
        	
        	// since m contains only one element (5, 0), if nums[] was like {1, 2, 4, 5}, then 5 + 1 is 6 which is the target.
        	// in this case, as m.containsKey(num[i]) is true, then we found the answer, and should return the two indices,
        	// which is i(the index of the second operand) and m.get(num[i]) (the index of the first operand).
        	
            if (!m.containsKey(nums[i])) {
                m.put(target-nums[i], i);
            	} else {
            		return new int[] {i, m.get(nums[i])};
            	}
        	}
        	throw new IllegalArgumentException("No solution available");
     	}
	 }
	 // https://leetcode.com/problems/two-sum/
}
