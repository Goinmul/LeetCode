package edu.handong.Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Algorithms {


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
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        
        for (int i=0; i < nums.length ; i++) {
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
