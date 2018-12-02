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
}
