package Lec52;

public class Maximum_SubArray_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 1, 3, 7, 5, 2, 4 };
		int k = 3;
		System.out.println(MaximumSubArraySum(arr, k));
	}

	public static int MaximumSubArraySum(int[] arr, int k) {
		int ans = 0, sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];

		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// growing
			sum -= arr[i - k];// shrink
			ans = Math.max(ans, sum);
		}
		return ans;

	}
}
