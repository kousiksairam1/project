package JavaBasics;
class ParentClass{
	public void parentClassMethod() {
		System.out.println("This is a Parent Class Method");
	}
}
class ChildClass extends ParentClass{
	public void childClassMethod() {
		System.out.println("This is child class Method");
	}
}
public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		c.childClassMethod();
		c.parentClassMethod();
		ParentClass p = new ParentClass();
		p.parentClassMethod();
	}

}
