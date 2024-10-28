package exceptionExample;
import java.io.IOException;

public class ThrowExample {
	int sum;
	public void opn(int a,int b) throws IOException
	{
		int s=a+b;
		if(s>10)
		{
			throw new IOException();// checked execption
		}
			
	}
	public void operation(int a,int b)throws IOException,ArithmeticException
	{
		sum=a+b;
		
		if(sum>20) 
		{
			throw new ArithmeticException();
		} 
		else
			throw new IOException();   //checked.so have to handle 
	}
	public void display()throws IOException
	{
		operation(20,12);
		System.out.println("Sum="+sum);
		
	} 
	public static void main(String[] args) throws IOException {
		ThrowExample obj=new ThrowExample();
		
		obj.opn(10,20);
		
		obj.display();
		
	}

}

