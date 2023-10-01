package Lec35;

import java.util.LinkedList;

public class Stack {
	private LinkedList<Integer> ll = new LinkedList<>();

	public void push(int item) {
		ll.addFirst(item);
	}

	public int pop() {
		return ll.remove();
	}
}
