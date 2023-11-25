package Lec49;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 2 };
		int cap = 4;
		System.out.println(Knapsack_0_1(wt, val, cap, 0));

	}

	public static int Knapsack_0_1(int[] wt, int[] val, int cap, int i) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + Knapsack_0_1(wt, val, cap - wt[i], i + 1);
		}
		exc = Knapsack_0_1(wt, val, cap, i + 1);
		return Math.max(inc, exc);

	}
}
