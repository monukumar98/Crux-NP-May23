package Lec9;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 6, 2, 1, 4 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			Insert(arr, i - 1, arr[i]);
		}

	}
	public static void Insert(int[] arr, int i, int item) {
		while (i >= 0 && arr[i] > item) {
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = item;

	}

}
