package Lec52;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 4, 6 };
		int k = 13;
		System.out.println(Product_Less_Than_K(arr, k));
	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int p = 1;
		while (ei < arr.length) {
			// Growing
			p = p * arr[ei];
			// Shrinking
			while (p >= k && si <= ei) {
				p /= arr[si];
				si++;
			}

			// ans
			ans = ans + (ei - si + 1);
			ei++;
		}
		return ans;

	}

}
