package Lec27;

//import java.util.ArrayList;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> ll = new ArrayList<>();
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
		s.name = "Kaju";
		s.age = 18;
		s.Intro_yourSelf();
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "Raju";
		s1.age = 22;
		s1.Intro_yourSelf();
		s2.name = "Kamlesh";
		s2.age = 16;
		s2.Intro_yourSelf();
		s.SayHey("Rahul");
		Student.fun(90);
//		s.fun(9);
		
	}
	static {
		System.out.println("I am in static blcoks in main");
	}

}
