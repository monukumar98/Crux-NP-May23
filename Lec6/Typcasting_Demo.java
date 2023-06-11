package Lec6;

public class Typcasting_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 78;
		int x = 787;
		short s = 67;
		long l = 2672687278l;
		System.out.println(b);
		int a = 10;
		byte c = 5;
		a = c;

		double d = 7.8;
		float f = 7.5f;
		char ch = 'a';
		ch++;// ++ += -= ch = (char)(ch+1)
		System.out.println(ch);
		char ch1 = 'c';
		// ch1 = ch1+1;
		//ch1 += 1;//ch1 = (char)(ch1+1)
		char c1 =(char)(ch + ch1);
		System.out.println(c1);

	}

}
