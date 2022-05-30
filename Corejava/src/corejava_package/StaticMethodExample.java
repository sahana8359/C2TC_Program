package corejava_package;

public class StaticMethodExample {
	static int j=100;
	int n=200;
	static void a()
	{
		int a=200;
		System.out.println("Print from a");
		n=100;
		a2()
		System.out.println("super j");
	}
	void a2()
	{
		System.out.println("inside a2");
	}

}
