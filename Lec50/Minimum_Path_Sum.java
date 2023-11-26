package Lec50;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(Minimum_Sum(arr, 0, 0));
	}

	public static int Minimum_Sum(int[][] arr, int i, int j) {
		if (i == arr.length - 1 && j == arr[0].length-1) {
			return arr[i][j];
		}
		if (i >= arr.length || j >= arr[0].length) {
			return Integer.MAX_VALUE;
		}

		int v = Minimum_Sum(arr, i + 1, j);
		int h = Minimum_Sum(arr, i, j + 1);
		return Math.min(v, h) + arr[i][j];

	}

}
