package exceptionsample;

public class Sample2 {

	public static void main(String[] args) {
	
		int a=10,b=20;
		int s=a+b;
		
		try
		{
			
			int res=5/0;
			int arr[]=new int[10];
			arr[12]=89;
		
			System.out.println("In try block");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("parent exception");
		}
		
		finally
		{
			System.out.println("finally block will always executed");
			
		}
		System.out.println("Rest of the code");
		
	
	}
}