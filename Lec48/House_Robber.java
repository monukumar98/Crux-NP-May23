package Lec48;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		int[] dp = new int[arr.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		System.out.println(Robber(arr, 0));
		System.out.println(RobberTD2(arr, arr.length - 1, dp));

	}

	public static int RobberBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int dontrob = dp[i - 1];
			dp[i] = Math.max(rob, dontrob);
		}
		return dp[dp.length - 1];

	}

	public static int RobberTD2(int[] arr, int i, int[] dp) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD2(arr, i - 2, dp);
		int dontrob = RobberTD2(arr, i - 1, dp);
		return dp[i] = Math.max(rob, dontrob);

	}

	public static int RobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD(arr, i + 2, dp);
		int dontrob = RobberTD(arr, i + 1, dp);
		return dp[i] = Math.max(rob, dontrob);

	}

	public static int Robber(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int rob = arr[i] + Robber(arr, i + 2);
		int dontrob = Robber(arr, i + 1);
		return Math.max(rob, dontrob);

	}

}
