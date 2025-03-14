package JavaBasics;
abstract class AbstractTest{
	int i=10;
	abstract void Method1();
	void testMethod() {
		System.out.println("Non Abstract Method");
	}
}

public class AbstractClassExample extends AbstractTest {
	

	@Override
	void Method1() {
		// TODO Auto-generated method stub
		i=20;
		System.out.println("Implementation of Abstract Method1 in Child");
		
	}
	public static void main(String[] args) {
		
		AbstractClassExample a1 = new AbstractClassExample();
		a1.Method1();
		a1.testMethod();
	}

}
