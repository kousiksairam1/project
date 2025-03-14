package JavaBasics;
class ParentOne{
	public void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is Parent 1 Class Method");

	}
}
class ParentTwo{
	public void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is Parent 2 Class Method");

	}
}
class Child extends ParentOne {
//extends ParentTwo
	public void childOneMethod() {
		System.out.println("This is ChildOne Class Method");
	}
}
public class MultipleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
