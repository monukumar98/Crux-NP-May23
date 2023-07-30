package Lec20;

public class Tricky_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		print(ques, "");
	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
		}
		for (int i = 0; i < ques.length(); i++) {
			boolean flag = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(i) == ques.charAt(j)) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				print(s1 + s2, ans + ques.charAt(i));
			}

		}
	}
}
