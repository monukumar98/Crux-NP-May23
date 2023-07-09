package Lec14;

public class IsPalindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Palindromic("nitin"));
	}

	public static boolean Palindromic(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
