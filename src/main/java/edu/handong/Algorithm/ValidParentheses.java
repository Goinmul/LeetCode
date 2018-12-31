package edu.handong.Algorithm;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	//HashMap<Character, Character> map = new HashMap<Character, Character>();
	/*
	public boolean isValid(String s) {
		if (s.length()%2==1)
			return false;
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		int start =0, end=s.length()-1;
		while (start < end){
			if (map.containsKey(s.charAt(start)) && map.get(s.charAt(start))==s.charAt(start+1)) {
				start += 2;
			}
			else if (map.containsKey(s.charAt(start)) && map.get(s.charAt(start))==s.charAt(end)){
				start++;
				end--;
			}
			else
				return false;
		}
		return true;
	}*/
	// (([]){})
	// 01234567

	public boolean isValidUsingStack(String s) {
		int prev_length = s.length();
		while (true) {

			if (s.length() ==0)
				return true;

			s = s.replaceAll("\\(\\)", "");
			s = s.replaceAll("\\{\\}", "");
			s = s.replaceAll("\\[\\]", "");

			if (s.length() == prev_length)
				return false;
			prev_length = s.length();
		}
	}

	
}

// I almost made it to the solution...!!!!
// my approach was right: the idea of deleting "()", "{}", "[]"
// meanwhile, I didn't use stack.(even though I thought about it)
// should work harder, think sharper next time.
class Solution1 {

	  // Hash table that takes care of the mappings.
	  private HashMap<Character, Character> mappings;

	  // Initialize hash map with mappings. This simply makes the code easier to read.
	  public Solution1() {
	    this.mappings = new HashMap<Character, Character>();
	    this.mappings.put(')', '(');
	    this.mappings.put('}', '{');
	    this.mappings.put(']', '[');
	  }

	  public boolean isValid(String s) {

	    // Initialize a stack to be used in the algorithm.
	    Stack<Character> stack = new Stack<Character>();

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);

	      // If the current character is a closing bracket.
	      if (this.mappings.containsKey(c)) {

	        // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
	        char topElement = stack.empty() ? '#' : stack.pop();

	        // If the mapping for this bracket doesn't match the stack's top element, return false.
	        if (topElement != this.mappings.get(c)) {
	          return false;
	        }
	      } else {
	        // If it was an opening bracket, push to the stack.
	        stack.push(c);
	      }
	    }

	    // If the stack still contains elements, then it is an invalid expression.
	    return stack.isEmpty();
	  }
	}


