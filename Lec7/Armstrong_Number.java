package Lec7;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsArmstrong(n));
	}
	public static boolean IsArmstrong(int n) {
		int c = countofdigit(n);
		int sum = 0;
		int p=n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;
		}
		return sum == p;
	}
	public static int countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

}
