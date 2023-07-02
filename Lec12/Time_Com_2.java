package Lec12;

public class Time_Com_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100000, k = 1;
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");

		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// (O(N))
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// log(N)
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			// log(N)
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");
			// (O(N))
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// log(N) base 6
			n /= 2;
			n /= 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// (O(N/K))
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base k
			i *= k;
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// (N^2)
				System.out.println("hey");
			}
		}
		for (i = 1; i * i <= n; i++) {
			// Sqrt(N)
			System.out.println("hey");
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					// O(N^4)
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// log(N) base 2
		}
		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					// (N^2(logN))
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				// O(N(logN))
				System.out.println("hey");
			}
		}
		// bubble
		// Selection
		// instersion
	}

}
