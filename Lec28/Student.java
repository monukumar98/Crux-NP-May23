package Lec28;

public class Student {
	private String name = "Kaju";
	private int age = 18;

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("bklol age -ve nhi hoga");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			System.out.println("I am finally blocks");
		}

	}

//	public void setAge(int age) throws Exception {
//		if (age < 0) {
//			throw new Exception("bklol age -ve nhi hoga");
//		}
//		this.age = age;
//	}

//	public void Setname(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return this.name;
//	}
}
