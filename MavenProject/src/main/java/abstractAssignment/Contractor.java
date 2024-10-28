package abstractAssignment;
import java.util.Scanner;

public class Contractor extends Employee {
	public void calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the payment for contractor:");
		int payment=sc.nextInt();
		System.out.println("Enter the working hours of contractor:");
		int w=sc.nextInt();
		int salary= payment*w;
		System.out.println("Salary of contractor:"+salary);
		
	}
	               
}
