package Lec21;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;// row
		int m = 3;// col
		Printpath(n - 1, m - 1, 0, 0, "");

	}

	public static void Printpath(int er, int ec, int cr, int cc, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		Printpath(er, ec, cr, cc + 1, ans + "H");
		Printpath(er, ec, cr + 1, cc, ans + "V");

	}

}
