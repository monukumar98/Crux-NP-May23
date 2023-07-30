package Lec20;

public class Key_Paid {
	static String[] code = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		keyPaid(ques, "");
	}
	public static void keyPaid(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);
		int idx = ch - '0';
		String press = code[idx];
		for (int i = 0; i < press.length(); i++) {
			keyPaid(ques.substring(1), ans + press.charAt(i));
		}

	}

}
