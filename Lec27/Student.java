package Lec27;



public class Student {

	String name;
	int age;
	static int count;
	

	public  void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);

	}

	public void SayHey(String name) {

		System.out.println(this.name + " Say Hey " + name);

	}

	public static void fun(int x) {
		System.out.println("I am in Fun" + x);
	}
	static {
		System.out.println("I am in static blcoks");
	}

}
