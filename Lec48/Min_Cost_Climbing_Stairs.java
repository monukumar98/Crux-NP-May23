package Lec48;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int zero = Climbing_Stairs(arr, 0);
		int one = Climbing_Stairs(arr, 1);
		System.out.println(Math.min(zero, one));

	}

	public static int Climbing_Stairs(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int fs = Climbing_Stairs(arr, i + 2);
		int ss = Climbing_Stairs(arr, i + 1);
		return arr[i] + Math.min(fs, ss);

	}

}
