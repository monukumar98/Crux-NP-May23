package Lec7;

public class Function_Demo_Part_3 {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println("Hey");
		int a = 5;
		System.out.println(val);//
		System.out.println(add(a, 45));
		System.out.println("Bye");
		System.out.println(val);//
	}

	public static int add(int a, int c) {
		int x = a + c;
		System.out.println(c);
		int val = 90;
		Function_Demo_Part_3.val += 5;
		return x - 3;
	}

}
