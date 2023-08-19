package Lec24;

public class Pow_log_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 9;
		System.out.println(pow(a, b));

	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int ans = pow(a, b / 2);
		ans = ans * ans;
		if (b % 2 != 0) {
			ans = ans * a;
		}
		return ans;
	}

}
