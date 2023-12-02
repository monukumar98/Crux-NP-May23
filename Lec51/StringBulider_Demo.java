package Lec51;

public class StringBulider_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.capacity());
		sb.append("Hello");
		sb.append('a');
		sb.append(1);
		System.out.println(sb);
		for (int i = 0; i < sb.length(); i++) {
			System.out.print(sb.charAt(i) + " ");
		}
		System.out.println();
		System.out.println(sb.substring(2, 4));
		String s = sb.toString();
		System.out.println(sb.length());
		sb.append("abcdefghi");
		System.out.println(sb.length());
		sb.append('b');
		System.out.println(sb.capacity());
	}

}
