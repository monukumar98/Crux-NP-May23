package Lec16;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Single(arr));
	}

	public static int[] Single(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		int mask = (ans & (~(ans - 1)));// 10
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) != 0) {
				a ^= arr[i];
			}
		}
		int b = ans ^ a;
		int[] ar = { a, b };
		return ar;

	}

}
