package JavaBasics;

public class MethodOverloadingExample {
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void addition(double a, double b, double c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// This is also known as Compiletime Polymorphism
		MethodOverloadingExample m1 = new MethodOverloadingExample();
		m1.addition(10, 20.5, 11.5);
		m1.addition(10, 20);
		m1.addition(10, 50, 60);

	}

}
