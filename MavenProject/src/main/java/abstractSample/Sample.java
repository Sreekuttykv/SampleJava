package abstractSample;

public class Sample extends AbstractClass {
	
	public void display()
	{
		System.out.println("Example of sample class");
	}
	public void print(int a,int b)
	{
		System.out.println("Definition abstract method");
	}
	public int hi()
	{
		int a=10+20;
		return a;
	} 
	public static void main(String[] args) {
		
		Sample o=new Sample();
		o.display();
		o.print(2,4);
		o.show();
		System.out.println(o.hi());
		
		//AbstractClass obj=new AbstractClass();
		
	}

}
