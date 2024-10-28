package exceptionExample;
import java.io.IOException;

public class ThrowExample {
	int sum;
	public void operation(int a,int b)throws IOException
	{
		sum=a+b;
		
		if(sum>20)
		{
			throw new ArithmeticException();
		}
		else
			throw new IOException();
	}
	public void display()throws IOException
	{
		operation(20,12);
		System.out.println("Sum="+sum);
		
	}
	public static void main(String[] args) {
		ThrowExample obj=new ThrowExample();
		try
		{
			obj.display();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sum greater than 20");
		}
		catch(IOException a)
		{
			System.out.println("Exception handled");
		}
		
	}

}


