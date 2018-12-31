package edu.handong.Algorithm;

import java.util.ArrayList;

public class PalindromeNumber {
	/*
	Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

	Example 1:
	
	Input: 121
	Output: true

	Example 2:
	
	Input: -121
	Output: false
	Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
	
	Example 3:
	
	Input: 10
	Output: false
	Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
	Follow up:

	Could you solve it without converting the integer to a string?
	*/

	// took 201 ms
	public boolean palindrome(int x)
	{
		if (x<0)
			return false;
		
		ArrayList<Integer> compare = new ArrayList<Integer>();
		int num = 0;
		
		while(x>0)
		{
			num = x%10; // starting from the smallest digit
			x = x/10;
			compare.add(num); // list gets number serially. if number was 1438, list would be like (8, 3, 4, 1)
		}
		
		for (int i=0; i< compare.size()/2; i++)
		{
			if (compare.get(i) != compare.get(compare.size()-1-i))
			{
				return false;
			}
		}
		return true;
	}
	
	// solution.
	public class Solution {
	    public boolean IsPalindrome(int x) {
	        // Special cases:
	        // As discussed above, when x < 0, x is not a palindrome.
	    	
	        // Also if the last digit of the number is 0, in order to be a palindrome,
	        // the first digit of the number also needs to be 0.
	        // Only 0 satisfy this property.
	        if(x < 0 || (x % 10 == 0 && x != 0)) { // 값이 음수 , 혹은, 10의 배수이지만 0이 아닌 경우(ex. 100000)
	            return false;
	        }

	        int revertedNumber = 0;
	        while(x > revertedNumber) {
	            revertedNumber = revertedNumber * 10 + x % 10;
	            x /= 10;
	        }

	        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
	        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
	        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
	        return x == revertedNumber || x == revertedNumber/10;
	    }
	}
}

