package Lec24;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Isprime(672));

	}

	public static boolean Isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
