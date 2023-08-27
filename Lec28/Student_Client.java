package Lec28;

//import Lec27.Person;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
//		s.name = "Rajesh";
//		s.age = -9;
		System.out.println(s.getName());
		s.setName("Ramesh");
		System.out.println(s.getName());
		s.setAge(-1);
		System.out.println("Hey");
		// System.out.println(s.age);
//		Person p = new Person("raj", 12);
//		p.age = 9;

	}

}
