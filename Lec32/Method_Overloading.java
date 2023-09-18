package Lec32;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(2, 4));
		System.out.println(Add(2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2));

	}

	public static int Add(int a, int b) {
		return a + b;
	}

	public static int Add(int a, int b, int c) {
		return a + b + c;
	}

	public static int Add(float a, int b, int c) {
		return (int) (a + b + c);
	}

	public static int Add(int y, int... ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		return sum;
	}

}
