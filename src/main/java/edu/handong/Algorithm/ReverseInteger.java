package edu.handong.Algorithm;

import java.util.HashMap;
import java.util.Map;

public class ReverseInteger {

	/*
	Problem #2 : Reverse integer
	difficulty : easy

	Given a 32-bit signed integer, reverse digits of an integer.

	Example 1:

	Input: 123
	Output: 321
	Example 2:

	Input: -123
	Output: -321
	Example 3:

	Input: 120
	Output: 21

	Note:
	Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
	For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
	 */


	// Approach #1 : convert integer type to string type, and parse the integer. Then reverse it, and convert again.
	// Approach #2 : iterate, and keep getting numbers in accordance with digits.

	public int reverse(int x)
	{
		boolean isPositive = true;

		// get the length of the integer
		int digit_length = 0;
		String str1 = String.valueOf(x);
		if(str1.charAt(0) == '-')
		{
			digit_length = str1.length()-1;
		}
		else
			digit_length = str1.length();	
		//System.out.println("digit length : "+ digit_length);

		int divider = (int)Math.pow(10, digit_length-1);
		int reverser = 1;

		int each_num = 0;
		int answer = 0;

		if (x<0)
		{
			isPositive = false;
			x = x*(-1); // make x positive, then process. Later for the result, should make it negative again.
		}

		long overflow_test = 0;
		for (int i = 0; i<digit_length; i++)
		{
			each_num = x/divider; // if x is 1423, for the first iteration each_num is 
			overflow_test = overflow_test + (long)each_num*reverser;
			answer = answer + each_num*reverser;
			
			//overflow check
			if (overflow_test > Integer.MAX_VALUE || overflow_test <Integer.MIN_VALUE)
			{
				System.err.println("overflow occurred.");
				return 0;
			}

			x = x%divider;
			reverser = reverser*10;
			divider = divider/10; // iterate until divider becomes 1/10. (valid until divider is 1)
		}

		// if the input was negative
		if (isPositive == false)
			answer = answer*(-1);

		System.out.println(answer);
		return answer;
	}

}
