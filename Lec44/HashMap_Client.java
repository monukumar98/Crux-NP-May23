package Lec44;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ankit", 77);
		map.put("Kunal", 67);
		map.put("Aditya", 32);
		map.put("Raju", 17);
		map.put("Mohan", 87);
		map.put("Amisha", 57);
		map.put("Sunil", 97);
		map.put("Ankita", 67);
		map.put("Shivani", 47);
		map.put("Shivani", 147);
		System.out.println(map);
		System.out.println(map.get("Shivani"));
	}

}
