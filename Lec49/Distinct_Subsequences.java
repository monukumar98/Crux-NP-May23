package Lec49;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "rabbbit";// coin
		String s2 = "rabbit";// amount
		int[][] dp = new int[s1.length()][s2.length()];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(Change_II(s1, s2, 0, 0, dp));

	}

	// s1--> coin --> i
	// s2--> amount-->j
	public static int Change_II(String s1, String s2, int i, int j, int[][] dp) {
		if (j == s2.length()) {
			return 1;
		}
		if (i == s1.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0;
		int exc = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			inc = Change_II(s1, s2, i + 1, j + 1, dp);
		}
		exc = Change_II(s1, s2, i + 1, j, dp);
		return dp[i][j] = inc + exc;

	}

}
