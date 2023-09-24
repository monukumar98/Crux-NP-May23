package Lec34;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode kartik = headA;
			ListNode kartik_GF = headB;
			while (kartik != kartik_GF) {
				if (kartik == null) {
					kartik = headB;
				} else {
					kartik = kartik.next;
				}
				if (kartik_GF == null) {
					kartik_GF = headA;
				} else {
					kartik_GF = kartik_GF.next;
				}

			}
			return kartik_GF;

		}
	}
}
