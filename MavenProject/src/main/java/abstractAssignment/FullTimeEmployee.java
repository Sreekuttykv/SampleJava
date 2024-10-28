package abstractAssignment;
import java.util.Scanner;

public class FullTimeEmployee extends Employee{
	
	public void calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the payment for full time employee:");
		int payment=sc.nextInt();
		System.out.println("Working hour :"+working_hour);
		int salary= payment* working_hour;
		System.out.println("Salary for full time employee :"+salary);
	}

	public static void main(String[] args) {
		
		FullTimeEmployee e=new FullTimeEmployee();
		e.calculateSalary();
		
		Contractor c=new Contractor();
		c.calculateSalary();
		

	}

}

