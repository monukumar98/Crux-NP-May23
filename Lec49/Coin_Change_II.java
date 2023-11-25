package Lec49;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[amount + 1][coin.length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(Change_II(coin, amount, 0, dp));
		System.out.println(Change_IIBU(coin, amount));
	}

	public static int Change_II(int[] coin, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coin.length) {
			return 0;
		}
		if (dp[amount][idx] != -1) {
			return dp[amount][idx];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= coin[idx]) {
			inc = Change_II(coin, amount - coin[idx], idx, dp);
		}
		exc = Change_II(coin, amount, idx + 1, dp);
		return dp[amount][idx] = inc + exc;

	}

	public static int Change_IIBU(int[] coin, int amount) {
		int[][] dp = new int[coin.length + 1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		for (int c = 1; c < dp.length; c++) {
			for (int am = 1; am < dp[0].length; am++) {
				int inc = 0;
				int exc = 0;
				if (am >= coin[c - 1]) {
					inc = dp[c][am - coin[c - 1]];
				}
				exc = dp[c-1][am];
				dp[c][am] = inc + exc;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

}
