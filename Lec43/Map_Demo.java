package Lec43;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add O(1)
		map.put("Raj", 87);
		map.put("Rahul", 67);
		map.put("Amisha", 77);
		map.put("Anku", 57);
		map.put("Rajesh", 72);
		map.put("Puneet", 98);
		map.put("Ankita", 79);
		map.put("Manoj", 48);
		map.put("Amit", 48);
		map.put("Amita", 48);
//		map.put("Amisha", 87);
//		map.put(null, 19);
		//System.out.println(map);
//		Set<String> set = map.keySet();
//
//		for (String key : set) {
//			System.out.println(key + " " + map.get(key));
//		}
		ArrayList<String> ll = new ArrayList<>(map.keySet());
		
		for (String key :  map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
//		// get O(1)
//		System.out.println(map.get("Amita"));
//		System.out.println(map.get("Atul"));
//
//		// containskey O(1)
//		System.out.println(map.containsKey("Amisha"));
//		System.out.println(map.containsKey("Pintu"));
//		// remove O(1)
//		System.out.println(map.remove("Puneet"));
//		System.out.println(map.remove("Palak"));
//		System.out.println(map);
//		// size O(1)
//		System.out.println(map.size());

		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add O(1)
		map1.put("Raj", 87);
		map1.put("Rahul", 67);
		map1.put("Amisha", 77);
		map1.put("Anku", 57);
		map1.put("Rajesh", 72);
		map1.put("Puneet", 98);
		map1.put("Ankita", 79);
		map1.put("Manoj", 48);
		map1.put("Amit", 48);
		map1.put("Amita", 48);
		// map1.put(null, 77);
		//System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add O(1)
		map2.put("Raj", 87);
		map2.put("Rahul", 67);
		map2.put("Amisha", 77);
		map2.put("Anku", 57);
		map2.put("Rajesh", 72);
		map2.put("Puneet", 98);
		map2.put("Ankita", 79);
		map2.put("Manoj", 48);
		map2.put("Amit", 48);
		map2.put("Amita", 48);
		map2.put(null, 77);
		//System.out.println(map2);

	}

}
