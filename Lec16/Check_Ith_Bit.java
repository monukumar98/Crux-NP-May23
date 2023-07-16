package Lec16;

public class Check_Ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 69;
		int i = 6;
		System.out.println(Isset(n, i));
	}
	public static int Isset(int n, int i) {
		int mask = (1 << i);
		if ((n & mask) != 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
