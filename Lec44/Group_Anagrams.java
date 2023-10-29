package Lec44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs= {"eat","tea","tan","ate","nat","bat"};
		System.out.println(GroupAnagrams(strs));

	}

	public static List<List<String>> GroupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String s = strs[i];
			String key = Key(s);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
		List<List<String>> ll = new ArrayList<>();
		for (String key : map.keySet()) {
			ll.add(map.get(key));
		}
		return ll;

	}

	public static String Key(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);// 'b'
			freq[ch - 'a']++;// freq[ch - 'a']= freq[ch - 'a']+1;

		}
		String ans = "";
		for (int i = 0; i < freq.length; i++) {
			ans = ans + freq[i];
		}
		return ans;

	}
}
