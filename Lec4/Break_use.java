package Lec4;

public class Break_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int fact = 0;
		for (int i = 2; i < n; i++) {// i<=n-1
			if (n % i == 0) {
				fact++;
				break;
			}
		}
		if (fact >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

}
