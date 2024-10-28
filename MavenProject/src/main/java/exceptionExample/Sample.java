package exceptionExample;

public class Sample {

	public static void main(String[] args) {
		
		
		int a=10,b=40;
		int sum=a+b;
		System.out.println(sum);
		int arr[]=new int[5];
		
		try
		{
			arr[9]=78;
			int result=5/0;
			
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size is 5");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("finaly  block will always executed");

		}
				System.out.println("Rest of the code");
		

	}

}
//try,catch,throw,throws,finally