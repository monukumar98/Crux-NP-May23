package Lec17;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		// add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1, 40);// index ka range 0 to size
		list.add(80);
		list.add(90);
		System.out.println(list);
		// size
		System.out.println(list.size());
		// get
		System.out.println(list.get(2));// index ka range 0 to size-1
		// remove
		System.out.println(list.remove(1));
		System.out.println(list);
		// update
		list.set(2, -11);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");

		}
		System.out.println();
		for (int val : list) {
			System.out.print(val + " ");
		}

	}

}
