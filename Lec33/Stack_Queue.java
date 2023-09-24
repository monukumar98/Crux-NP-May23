package Lec33;

import Lec32.DyamicQueue;

public class Stack_Queue {

	private DyamicQueue q;

	public Stack_Queue() {
		// TODO Auto-generated constructor stub
		q = new DyamicQueue();
	}

	public boolean Isempty() {
		return q.isEmpty();
	}

	public int size() {
		return q.size();
	}

	public void push(int item) throws Exception {
		q.Enqueue(item);
	}

	public int pop() throws Exception {
		DyamicQueue hlp = new DyamicQueue();
		while (q.size() > 1) {
			hlp.Enqueue(q.Dequeue());
		}
		int rv = q.Dequeue();
		while (hlp.size() > 0) {
			q.Enqueue(hlp.Dequeue());
		}
		return rv;
	}

  //O(N)
	public int peek() throws Exception {
		DyamicQueue hlp = new DyamicQueue();
		while (q.size() > 1) {
			hlp.Enqueue(q.Dequeue());
		}
		int rv = q.Dequeue();
		while (hlp.size() > 0) {
			q.Enqueue(hlp.Dequeue());
		}
		q.Enqueue(rv);
		return rv;
	}

	public static void main(String[] args) throws Exception {
		Stack_Queue sq = new Stack_Queue();
		sq.push(1);
		sq.push(2);
		sq.push(3);
		System.out.println(sq.peek());
		System.out.println(sq.pop());
		System.out.println(sq.peek());
	}

}
