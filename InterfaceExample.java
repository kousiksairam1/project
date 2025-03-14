package JavaBasics;
interface TestInterface{
	int i =10;
	void Test1(); 
}
public class InterfaceExample implements TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample a1= new InterfaceExample();
		a1.Test1();

	}

	@Override
	public void Test1() {
		// TODO Auto-generated method stub
		System.out.println("Interface Method implementation");
	}

}
