package Herença_e_Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		 Double n = sc.nextDouble();
		 
		 for(int i = 1; i <= n; i++ ) {
			 System.out.printf("Employee #%d data: ", i);
				System.out.print("Outsourced (y/n)?: ");
				char ch = sc.next().charAt(0);
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				if(ch == 'y') {
					System.out.print("Additional charge: ");
					double additionalCharge = sc.nextDouble();
					list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
				} else if (ch =='n'){
					list.add(new OutSourcedEmployee(name, hours, valuePerHour, valuePerHour));
				} else {
					System.out.println("Invalid");
				}				
		 }
		 System.out.println();
		 System.out.println("PAYMENTS: ");
		 for(Employee emp : list) {
			 System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		 }
		 
		 sc.close();	 
		 

	}

}
