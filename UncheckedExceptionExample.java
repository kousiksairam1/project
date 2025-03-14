package JavaBasics;

import java.util.Scanner;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example1
		/*System.out.println("Program Started.......");
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the number");
		int n = s.nextInt();
		try {
		System.out.println(100/n);
		}
		catch(ArithmeticException a){
			System.out.println(a.getMessage());
		}
		System.out.println("Program Completed");*/
		
		//Example2
		try {
		System.out.println("Program Started.......");
		Scanner i = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Please Enter the position between 0 - 4");
		int pos = i.nextInt();
		System.out.println("Please Enter the number");
		int value = i.nextInt();
		System.out.println(a[pos]=value);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		/*catch(NumberFormatException e1) {
			System.out.println(e1.getMessage());
		}
		catch(NullPointerException e2) {
			System.out.println(e2.getMessage());
		}*/
		System.out.println("Program Completed");
		
		
		//Example3
		/*System.out.println("Program Started.......");
		Scanner i1 = new Scanner(System.in);
		System.out.println("Please Enter number");
		String s1= i1.nextLine();
		int n1 = Integer.parseInt(s1);
		System.out.println(n1);
		System.out.println("Program Completed");*/
		
		//Example4
		/*String d = null;
		System.out.println(d.length());*/
		
		
		
		
	}

}
