package exceptionsample;

import java.io.IOException;

public class Examplethrow {
	public static void check(int a,int b) 
	{
		int sum=a+b;
		if(sum>50)
		{
			throw new ArithmeticException("sum is greater than 50");
		}
		else
		{
			System.out.println("sum is less than 50");
		}
		
		
	}
	 
	
	
	public static void main(String[] args){
		
		try
		{
			Examplethrow.check(80,7);

		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
		
		
		//Examplethrow.check(80,7);
		
		System.out.println("rest of the code");    
		
	}
}
		
		