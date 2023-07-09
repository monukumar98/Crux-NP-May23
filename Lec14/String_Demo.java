package Lec14;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str2 == str4);
		System.out.println(str2 == str1);
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
		String s1 = "hey";
		String s2 = "bey";
		// String s=s1+s2;
		String s = s1.concat(s2);
		System.out.println(s);
		String s3 = "Hey" + "bye";
		System.out.println(str2.equals(str4));

	}

}
