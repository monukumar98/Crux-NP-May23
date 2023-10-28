package Lec43;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(-3);
		set.add(21);
		set.add(11);
		set.add(3);
		set.add(5);
		System.out.println(set);

//		// get
//		System.out.println(set.contains(91));
//		System.out.println(set.contains(21));
//		// remove
//		System.out.println(set.remove(91));
//		System.out.println(set.remove(21));
//		System.out.println(set);
//		for (int v : set) {
//			System.out.print(v + " ");
//		}
//		System.out.println();
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set1.add(2);
		set1.add(-3);
		set1.add(21);
		set1.add(11);
		set1.add(3);
		set1.add(5);
		System.out.println(set1);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(2);
		set2.add(-3);
		set2.add(21);
		set2.add(11);
		set2.add(3);
		set2.add(5);
		System.out.println(set2);
	}

}
