package finalExample;

public  class Sample {
	
	
	static final int B=4;

	final int a;   //blank final variable or uninitialized final var
	public Sample()
	{
		a=90;
		System.out.println(B+20);
		System.out.println(B);
		
	}
	
	public void print(int a) {
		
		
		System.out.println("Value of a:");
	}
public void print(float a) {
		
		
		System.out.println("Value of a:");
	}
	public static void main(String args[])
	{
		
		Sample s=new Sample();
		//s.print();
		System.out.println(s.a);
		System.out.println(s.B);
	}
}
