package Lec50;

public class Lis_N_Log_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lis(arr));
	}

	private static int lis(int[] arr) {
		// TODO Auto-generated method stub
		int[] lis = new int[arr.length];
		lis[0] = arr[0];
		int len = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > lis[len - 1]) {
				lis[len] = arr[i];
				len++;
			} else {
				int idx = binarySearch(lis, 0, len - 1, arr[i]);
				lis[idx] = arr[i];
			}

		}
		return len;

	}

	private static int binarySearch(int[] lis, int si, int ei, int val) {
		// TODO Auto-generated method stub
		int idx = 0;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (lis[mid] >= val) {
				idx = mid;
				ei = mid - 1;
			} else {
				si = mid + 1;
			}
		}
		return idx;
	}

}
