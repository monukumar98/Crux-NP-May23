package Lec12;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 6, 2, 1, 4 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			boolean f = false;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					f = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (f == false) {
				break;
			}
		}

	}
}
