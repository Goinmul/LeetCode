package edu.handong.Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Sets;

/*
	Write a function to find the longest common prefix string amongst an array of strings.

	If there is no common prefix, return an empty string "".

	Example 1:

	Input: ["flower","flow","flight"]
	Output: "fl"
	Example 2:

	Input: ["dog","racecar","car"]
	Output: ""
	Explanation: There is no common prefix among the input strings.
	Note:

	All given inputs are in lowercase letters a-z.
 */

// 일단, 간단하게 두 문장의 공통 접두사를 찾는코드부터 생각
// 찾는 것이 longest common prefix 인 것을 반드시 숙지.


// Approach)
// #1 Radix way
// #2 Linked List of.. each words

// #3 !!!! 모두 한꺼번에 비교하기. 예를들어서 모든 word들에 대해서 index 0번 비교, 1번 비교... 이렇게 가기!! 그래서 하나씩 Mapping시키면 엄청 빠를듯.
public class LongestCommonPrefix {

	public String prefix(String[] input) {

		// must think carefully when choosing data structure.
		// < frequency, index, prefix(ascii value) >

		//ArrayList<HashMap<Integer, Integer>> data = new ArrayList<HashMap<Integer, Integer>>();		// main data structure, list containing hash maps
		
		Map<List<Integer>, List<Integer>> myMap = new HashMap<List<Integer>, List<Integer>>(); // key : prefix in ASCII / value ( frequency, index of input[] )
		for (int i = 0; i < input.length; i++) // iterate the list, to find frequency of the first character
		{
			int alphabet = (int)input[i].charAt(i); // the first character of the words from input[]
			List<Integer> prefix = new ArrayList<Integer>(); // we need set, because prefix is not a single character. It could be of multiple characters.
			List<Integer> key = new ArrayList<Integer>(2);	// key is like ( frequency, index in input[] )
			
			prefix.add(alphabet); // but at the first iteration, the set would contain only one character like ( 65 )
			
			if (myMap.containsKey(prefix) == false) // if my map doesn't have that character, save it with its frequency being 1.
			{
				key.add(1); // adding frequency
				myMap.put(prefix, key);
				
			}
			else
				myMap.replace(prefix, myMap.get(prefix) +1 ); // if my map had that character, just update the frequency by +1.
		}
		
		if (myMap.size() == input.length || myMap.size() == 0) // when there is no common prefix or input was empty
			return "";
		
		
		
		
		
		
		
		
		
		/*
		 *  첫번째 시도...
		// for 문을 돌리는데, condition문의 bias값을 계속 바꾸어 줄 것임. (most common prefix의 숫자에 맞추어서 계속 줄여줄것)
		int length = input.length;
		for (int i = 0; i<length;i++)
		{
			for (int j =0; j< input[i].length() ; j++)
			{
				if (compare.containsKey(input[i].charAt(j)))
					compare.replace(input[i].charAt(j), <i>, compare.get(input[i][j]+1) )

				input[i].charAt(j);
			}
		}

		while (length > 0)
		{
			// first iteration gets all the first characters
			for (int i=0; i<length; i++)
			{
				if (compare.containsKey(input[i])) // error. since input[i] is a word, like "flower".
					compare.replace(input[i], HashSet<compare.get(input[i])+1>, i>);
				else
					compare.put(input[i], 1);
			}
			if (compare.size() == input.length) return ""; // if no common prefix


			// before the second iteration, delete elements having less common prefix

		}
		// <f,2> 에서 제일 큰 integer값을 찾은 다음, 걔네들만 비교해주기
		for (int frequency : compare.values())
		{

		}*/

		return "prefix";
	}

}
