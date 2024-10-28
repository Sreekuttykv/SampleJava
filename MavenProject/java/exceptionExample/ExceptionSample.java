package exceptionExample;

import java.util.Scanner;


public class ExceptionSample {
	public void operation(int num1,int num2)
	{
		int result; 
		int arr[]=new int[5];
		try
		{
			result=num1/num2;
			System.out.println("Division"+result);
			for(int i=0;i<5;i++)
			{
				arr[i]=i+1;
				System.out.println(arr[i]);
			
			}
			System.exit(0); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array size is 5");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("The end...");
	}

	public static void main(String[] args) {
		ExceptionSample s=new ExceptionSample();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		s.operation(a, b);
			

	}

}
