package JavaBasics;
class GrandParent1 {
	int i=10;
	public void grandParentMethod() {
		
		System.out.println("GrandParent Method");
	}
}
class Parent1 extends GrandParent1 {
	int i=20;
	public void parentMethod() {
		
		System.out.println("Parent Method");
	}
}
class Child1 extends Parent1{
	int i=30;
	public void childMethod() {
		System.out.println("Child Method");
		System.out.println(super.i);
		
	}
}
public class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent1 g1=new GrandParent1();
		Parent1 p1= new Parent1();
		Child1 c1= new Child1();
		g1.grandParentMethod();
		p1.grandParentMethod();
		p1.parentMethod();
		c1.childMethod();
		c1.grandParentMethod();
		c1.parentMethod();

	}

}
