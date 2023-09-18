package Lec32;

public class Student {

	String name = "Ankit";
	int age = 25;

	@Override
	public String toString() {
		return this.name + " " + this.age;
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
	}

}
