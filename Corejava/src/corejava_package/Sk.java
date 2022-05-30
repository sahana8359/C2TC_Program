package corejava_package;

public class Sk {
	static int age;
	public static void main(String[] args) {
		Sk ob1=new Sk();
		Sk ob2=new Sk();
		ob1.age=30;
		ob2.age=40;
		System.out.println("age is"+ob1.age);
		System.out.print("age is"+ob2.age);
	}

}
