package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++ --> Increment
		// -- --> Decrement
		int x = 6;
//        x++;// x = x+1;
//        ++x;// // x = x+1;
//		System.out.println(x++);
//		System.out.println(x);
		int y = x++ + 4 + x-- - x-- + 7 + ++x + --x;
//		System.out.println(++x);
//		System.out.println(x);
		System.out.println(y);

	}

}
