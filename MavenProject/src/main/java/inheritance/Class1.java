package inheritance;

public class Class1 {
	int a=50;
	int b=20;
	public Class1(int c,int d)
	{
	
		int s=a+b;
		System.out.println("Addition="+s);
		//this.sum();
		System.out.println("parent constructor");
	}
	public void sum() {
		int c=a+b;
		System.out.println("Sum= "+c);	
}
 
}
 