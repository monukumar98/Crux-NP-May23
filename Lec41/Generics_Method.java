package Lec41;

public class Generics_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "Raj", "Rahul", "Kunal", "Komal", "Kaju" };
		Integer arr[] = { 10, 20, -9, 11, 134 };
		Display(str);
		Display(arr);
	}

	public static <T> void Display(T str[]) {
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}

}
