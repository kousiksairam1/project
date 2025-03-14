package JavaBasics;
class Vehicle{
	public void speedLimit() {
		System.out.println("Max Speed Limit is 100");
	}
}
class Bike extends Vehicle{
	public void speedLimit() {
		System.out.println("Max Speed Limit is 200");
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Run-time Polymorphism
		Bike b = new Bike();
		b.speedLimit();

	}

}
