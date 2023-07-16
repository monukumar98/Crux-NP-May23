package Lec15;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 10;// auto-boxing
		a1 = a1 + 5;
		System.out.println(a1);
		Integer b1 = 19;
		Integer b2 = 19;
		Integer c1 = 190;
		Integer c2 = 190;
		System.out.println(b1 == b2);
		System.out.println(c1 == c2);
		a1 = a;// auto-boxing
		int b = b1;// UN-boxing

	}

}
