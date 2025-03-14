package JavaBasics;
class ParentNew{
	String name= "Harika";
}
public class ThisAndSuperKeywordExample extends ParentNew {
	String name= "Vangala Harika";
	void Display() {
		System.out.println(this.name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAndSuperKeywordExample t1= new ThisAndSuperKeywordExample();
		t1.Display();

	}

}
