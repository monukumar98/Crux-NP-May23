package Lec18;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 7, 8, 5, 2, 5, 11 };
		int item = 5;
		System.out.println(Index(arr, item, 0));

	}

	public static int Index(int[] arr, int item, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return Index(arr, item, idx + 1);

	}

}
