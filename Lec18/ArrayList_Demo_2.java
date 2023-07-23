package Lec18;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			ll.add(sc.nextInt());

		}
		ll.add(23);
		ll.add(13);
		ll.add(230);
		ll.add(231);
		ll.add(73);
		ll.add(63);
		System.out.println(ll);

	}

}
