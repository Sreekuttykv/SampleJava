package sample;

public class Calculator {
	static int a=10;
	static int b=20;
	public static void sum()
	{
		int c=a+b;
		System.out.println("Addition of a and b is:"+c);
	}
	public static void diff()
	{
		int d=a-b;
		System.out.println("Difference of a and b is:"+d);
	}

	public static void main(String[] args) {
		Calculator.sum();
		Calculator.diff();
		// TODO Auto-generated method stub

	}

}
