package edu.handong.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
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

	 public String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    return prefix;
		}
	 
	 public String longestCommonPrefix_vertical(String[] strs) {
		    if (strs == null || strs.length == 0) return "";
		    for (int i = 0; i < strs[0].length() ; i++){					// iterate through the index of first word. 
		        char c = strs[0].charAt(i);									// if the word is flower, f, l, o, w, e, r.
		        for (int j = 1; j < strs.length; j ++) {					// iterate through the elements of input string array, starting from second element.
		            if (i == strs[j].length() || strs[j].charAt(i) != c)	// 
		                return strs[0].substring(0, i);             
		        }
		    }
		    return strs[0];
		}
	
	public String prefix(String[] input) {

		// must think carefully when choosing data structure.

		// using something like radix sort
		Arrays.sort(input);
		
		
		return "prefix";
	}

		
		// map ( prefix, frequency )
		
		
		/*
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		String final_prefix="";
		for (int k =0; ; k++)
		{
			for (int i=0; i< input.length; i++)
			{
				String prefix = "" + input[i].charAt(k);
				if (myMap.containsKey(prefix) == false)
					myMap.put(prefix, 1);
				else {
					myMap.replace(prefix, myMap.get(input[i])+1);
				}
			}

			// find a string with largest frequency
			int max = 0;
			String longest = "";
			for ( String key : myMap.keySet())
			{
				if (max < myMap.get(key))
					max = myMap.get(key);
				longest = key;
			}
			final_prefix = final_prefix + longest;
		}
		//	update the input[] to compare again.
*/

		/* !) why this thing doesn't work?
		for (Map.Entry<String, Integer> entry = myMap.entrySet() )
		{
			String key = entry.getKey();
			String value = entry.getValue();
		}
		 */







		/* 2nd trial
		//ArrayList<HashMap<Integer, Integer>> data = new ArrayList<HashMap<Integer, Integer>>();		// main data structure, list containing hash maps
		Map<List<Integer>, List<Integer>> myMap = new HashMap<List<Integer>, List<Integer>>(); // key : prefix in ASCII / value ( frequency, index of input[] )

		// first iteration to create a map
		for (int i = 0; i < input.length; i++) // iterate the list, to find frequency of the first character
		{
			int alphabet = (int)input[i].charAt(0); // the first character of the words from input[]
			List<Integer> prefix = new ArrayList<Integer>(); // we need set, because prefix is not a single character. It could be of multiple characters.
			List<Integer> value = new ArrayList<Integer>(2);	// value is like ( frequency, index in input[] )

			prefix.add(alphabet); // but at the first iteration, the set would contain only one character like ( 65 )

			if (myMap.containsKey(prefix) == false) // if my map doesn't have that character, save it with its frequency being 1.
			{
				value.add(1); // adding frequency
				myMap.put(prefix, value);

			}
			else	// already has that prefix, so we should increment the frequency
			{
				List<Integer> new_value = new ArrayList<Integer>(2);
				new_value=myMap.get(prefix);
				new_value.set(1, new_value.get(1) + 1);
				myMap.replace(prefix, new_value); // if my map had that character, just update the frequency by +1.
			}
		}

		if (myMap.size() == input.length || myMap.size() == 0) // when there is no common prefix or input was empty
			return "";

		int longest_prefix_index = 0;
		for (int j = 0; j<myMap.values().size() ; j++)
		{
		}
		 */





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

		
}
