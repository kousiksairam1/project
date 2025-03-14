package JavaBasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       int f =1;
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter any number to find factorial");
		        int n = s.nextInt();
		        for(int i=n;i>1;i--)
		        {
		            f=f*i;
		        }
		        System.out.println("Factorial of "+n+" is  "+f);
		    }    
}