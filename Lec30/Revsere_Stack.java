package Lec30;

import java.util.Stack;

public class Revsere_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Revsere(st);
		System.out.println(st);
	}
	private static void Revsere(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			return;
		}
		int x = st.pop();
		Revsere(st);
		AddElem(st, x);

	}
	public static void AddElem(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		AddElem(st, item);
		st.push(x);

	}

}
