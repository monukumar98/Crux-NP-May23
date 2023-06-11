package Lec7;

public class Arrays_Demo_2 {
	public static void main(String[] args) {
		int[] arr = { 1, 34, 56, 78, 90 };
		int[] other = arr;
		for (int i = 0; i < other.length; i++) {
			System.out.print(other[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
