package Lec8;

public class Arrays_Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 34, 56, 78, 90 };
		System.out.println(arr[0] + " " + arr[1]);// 1 34
		swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);//
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
