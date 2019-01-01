package edu.handong.Algorithm;



public class MergeTwoLists {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode l3 = null; // header
		
		ListNode cur1 = l1, cur2 = l2, cur3 = l3;
		while (cur1==null && cur2==null) {
			if (cur1.val == cur2.val) {
				// add both on the tail of l3
				cur3.next = new ListNode(cur1.val);
				cur3 = cur3.next;
				cur3.next = new ListNode(cur1.val);
				cur3 = cur3.next;
				// proceed
				cur1 = cur1.next;
				cur2 = cur2.next;
			}
			else if (cur1.val > cur2.val) { // add only the smaller one(cur2)
				cur3.next = new ListNode(cur2.val);
				cur3 = cur3.next;
				cur2 = cur2.next;
			}
			
			else { // if (cur2.val > cur1.val) // add only the smaller one(cur1)
				cur3.next = new ListNode(cur1.val);
				cur3 = cur3.next;
				cur1 = cur1.next;
			}
			if (cur1 == null) {
				while(cur2 != null) {
					cur3.next = new ListNode(cur2.val);
					cur3 = cur3.next;
					cur2 = cur2.next;
				}
			}
			if(cur2 == null) {
				while(cur1 != null) {
					cur3.next = new ListNode(cur1.val);
					cur3 = cur3.next;
					cur1 = cur1.next;
				}
			}
		}
		return l3;
	}
	
	
	// #1 trial, time limit exceeded :(
	/*
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode temp1 =null, prev1 = l1, temp2=null, prev2=l2, cur1 = l1, cur2 = l2;
		while (true) {
			if (cur1.val == cur2.val) { // if value same, proceed
				prev1 = cur1;
				cur1 = cur1.next;
				prev2 = cur2;
				cur1 = cur2;
				cur2 = cur2.next;
			}
			
			else if (cur1.val > cur2.val) {
				temp2 = cur2.next; // save l2's link
				cur2.next = cur1;
				prev1.next = prev2;
				cur2 = temp2;
				
				prev1 = prev2.next;
				prev2 = cur2;
			}
			else { // (cur1.val < cur2.val)
				temp1 = cur1.next;
				cur1.next = cur2;
				prev2.next = prev1;
				cur2 = cur1;
				cur1 = temp1;
				
				prev2 = prev1.next;
				prev1 = cur1;
			}
			if (cur1 == null)
				return l2;
			else if (cur2 == null)
				return l1;
		}
	}
	*/

}
