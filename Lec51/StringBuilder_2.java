package Lec51;

public class StringBuilder_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder_Demo();
		String_Demo();

	}

	public static void String_Demo() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}
		System.out.println(s);

	}

	public static void StringBuilder_Demo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
		//System.out.println(sb);
	}
}
