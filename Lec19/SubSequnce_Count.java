package Lec19;

public class SubSequnce_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
//		Print(ques, "");
//		System.out.println(count);
		System.out.println("\n" + PrintCount(ques, ""));

	}

	static int count = 0;

	public static int PrintCount(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");

			return 1;
		}
		char ch = ques.charAt(0);
		int a = PrintCount(ques.substring(1), ans);
		int b = PrintCount(ques.substring(1), ans + ch);
		return a + b;
	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		char ch = ques.charAt(0);
		Print(ques.substring(1), ans);
		Print(ques.substring(1), ans + ch);
	}

}
