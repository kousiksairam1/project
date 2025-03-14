package JavaBasics;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of electrical units consumed");
        double n = s.nextInt();
        if(n<=50)
        {
            bill= n*0.50;
            System.out.println("Electricity bill for "+ n+ "units is: "+bill);
        }
        else if(n>50 && n<=200){
            bill= (50*0.50)+((n-50)*0.75);
            bill = bill+(bill* 0.20);
            System.out.println("Electricity bill for "+ n+ "units is: "+bill);
        }
        else if(n>200 && n<=450){
            bill= (50*0.50)+(150*0.75)+((n-200)*1.20);
            bill = bill+(bill* 0.20);
            System.out.println("Electricity bill for "+ n+ "units is: "+bill);
        }
        else {
            bill= (50*0.50)+(150*0.75)+(250*1.20)+(n-450);
            bill = bill+(bill* 0.20);
            System.out.println("Electricity bill for "+ n+ "units is: "+bill);
        }
        

	}

}
