package Lec32;

import Lec29.Queue;

public class DyamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] a = new int[2 * arr.length];
			for (int i = 0; i < size; i++) {
				int idx = (front + i) % arr.length;
				a[i] = arr[idx];
			}
			front = 0;
			arr = a;
		}
		super.Enqueue(item);

	}
	public static void main(String[] args) throws Exception {
		DyamicQueue dq = new DyamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Enqueue(150);
		dq.Display();
	}

}
