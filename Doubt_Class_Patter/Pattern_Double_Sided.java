package Doubt_Class_Patter;

import java.util.Scanner;

public class Pattern_Double_Sided {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space1 = n - 1;
		int space2 = -1;
		int star = 1;
		int val = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space1) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				p--;
				j++;
			}

			int k = 1;
			while (k <= space2) {
				System.out.print("  ");
				k++;
			}
			int l = 1;
			p = 1;
			if (row == 1 || row == n) {
				l++;
			}

			while (l <= star) {
				System.out.print(p + " ");
				p++;
				l++;
			}
			if (row <= n / 2) {
				space1 -= 2;
				space2 += 2;
				star++;
				val++;
			} else {
				space1 += 2;
				space2 -= 2;
				star--;
				val--;
			}
			row++;
			System.out.println();

		}

	}
}
