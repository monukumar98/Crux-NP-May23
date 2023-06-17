package Lec8;

public class ReverSal_ALgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Rotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		k = k % arr.length;
		int n = arr.length;
		// first n-k element
		Reverse(arr, 0, n - k - 1);
		// last k elemet
		Reverse(arr, n - k, n - 1);
		// complete
		Reverse(arr, 0, n - 1);

	}

	public static void Reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}
}
