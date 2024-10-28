package inheritance;
import java.util.Scanner;
public class Pay {
	
	double basic_pay,deduction,bonus;
	public void basic()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic pay:");
		basic_pay=sc.nextDouble();
		System.out.println("Enter the deduction:");
		deduction=sc.nextDouble();
		System.out.println("Enter the bonus:");
		bonus=sc.nextDouble();
	}
}
  