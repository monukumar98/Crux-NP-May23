package Lec32;

import Lec29.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isfull()) {
			int[] a = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				a[i] = arr[i];
			}
			arr = a;
		}
		super.push(item);
	}

	public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		ds.push(1);
		ds.push(5);
		ds.push(7);
		ds.push(11);
		ds.push(12);
		ds.push(8);
		ds.Display();

	}
}
