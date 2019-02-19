package edu.handong.Algorithm;
/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray {


	public int removeDuplicates(int[] nums) {

		if (nums.length == 0)
			return 0;

		// else
		// since nums.length != 0, it is same or larger than 1
		int length = 1;
		
		// swap is the very index where you will put the newly - found different number.
		int swap = 1;

		for (int i=0 ; i< nums.length ; i++){

			// if checking number is same, nothing happens,
			// but if the number is different,
			if (i+1<nums.length && nums[i] != nums[i+1]){
				
				// increase length(returning result value)
				length++;
				
				// put the newly found number at 'swap' index
				nums[swap] = nums[i+1];
	
				// move the place(increase) where next newly found number will come into
				swap++;
			}

		}
		return length;
	}


}
