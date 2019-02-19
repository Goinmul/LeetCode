package edu.handong.Algorithm;

public class ImplementstrStr {

	public int strStr(String haystack, String needle) {

		if (needle.length() == 0) return 0;
		boolean find = false;

		// at the beginning, limit the comparing time up to the difference between two words plus one.
		for (int i=0; i< haystack.length() - needle.length() + 1 ; i++){

			// later, if possible, proceed 'i' in order to reduce unnecessary repitition (#1)
			// int proceed = 0;

			// word comparison
			int compareIndex = i;
			for (int j=0; j<needle.length(); j++){

				// not matching
				if(haystack.charAt(compareIndex) != needle.charAt(j)){
					find = false;
					break;
				}

				// matching character
				else {
					compareIndex++;
					find = true;
				}

			}
			if (find)
				return i;

		}

		// reaching here indicates that 'needle' is not in the 'haystack'.
		return -1;

	}



	/*

	// proceed part
	                    if (haystack[compareIndex] != haystack[compareIndex+1]) // (!) Would occur index out of bound error
	                        i++;

	int checkingIndex = 0;
	        int targetLength = needle.length;

	        // index out of bound handling condition
	        while (checkingIndex + targetLength <= haystack.length){

	            // internally comparing target word
	            for (int i = 0, j = checkingIndex; i < targetLength; i++, j++){

	                // comparing each character
	                if (haystack[j] != needle[i]){
	                    checkingIndex++;
	                    break;
	                }

	                else
	                {
	                    j++;
	                    // for later comparison, propagate the checking index.
	                    // index out of bound exception was already handled at the while loop condition.

	                    if (haystack[j] != haystack[j+1])
	                        checkingIndex++;
	                }


	            }

	        }
	 */

}
