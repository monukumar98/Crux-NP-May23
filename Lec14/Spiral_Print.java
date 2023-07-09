package Lec14;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//				     { 45, 67, 89, 12, 11 } , 
//				     { 450, 670, 890, 120, 110 } };
		Print(arr);
	}

	public static void Print(int[][] arr) {
		int minc = 0;
		int maxc = arr[0].length - 1;
		int minr = 0;
		int maxr = arr.length - 1;
		int count = 0;
		int e = arr.length * arr[0].length;
		while (count < e) {
			for (int i = minc; i <= maxc && count < e; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;
			for (int i = minr; i <= maxr && count < e; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < e; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < e; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;
		}

	}

}
