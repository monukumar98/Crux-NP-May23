package Lec3;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n / 2 + 1;
		int space = -1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k = 1;
			if (row == 1 || row == n) {
				k++;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			if (row <= n / 2) {
				space += 2;
				star--;
			} else {
				space -= 2;
				star++;
			}
			row++;
			System.out.println();

		}

	}

}
