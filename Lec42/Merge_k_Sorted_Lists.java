package Lec42;

import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {
			PriorityQueue<ListNode> pq = new PriorityQueue<>();
			for (ListNode node : lists) {
				if (node != null) {
					pq.add(node);
				}
			}
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (!pq.isEmpty()) {
				ListNode rn = pq.poll();
				Dummy.next = rn;
				Dummy = Dummy.next;
				if (rn.next != null) {
					pq.add(rn.next);
				}
			}
			return temp.next;

		}
	}
}
