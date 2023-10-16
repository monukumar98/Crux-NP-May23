package Lec40;

public abstract class Abstract_Demo {

	public abstract int fun();

	public abstract void fun1();

	public void Sayhey() {

	}

	public static void main(String[] args) {
		Abstract_Demo ab = new Abstract_Demo() {

			@Override
			public void fun1() {
				// TODO Auto-generated method stub

			}

			@Override
			public int fun() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
