package JavaBasics;
class Parent{
	public void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is Parent Class Method");

	}
}
class ChildOne extends Parent{
	public void childOneMethod() {
		System.out.println("This is ChildOne Class Method");
	}
}
class ChildTwo extends Parent{
	public void childTwoMethod() {
		System.out.println("This is ChildTwo Class Method");
	}
}
public class HierarichalInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOne c1= new ChildOne();
		ChildTwo c2= new ChildTwo();
		c1.childOneMethod();
		c1.parentMethod();
		c2.childTwoMethod();
		c2.parentMethod();

	}

}
