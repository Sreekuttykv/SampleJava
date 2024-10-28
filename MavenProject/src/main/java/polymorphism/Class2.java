package polymorphism;


public class Class2 extends Class1{
	int mark=5;
	public void print(int c,int d)
	{
		super.print(5,8);
		int s=c+d;
		System.out.println("C  Sum="+s);
		System.out.println("C Age"+age);
		//System.out.println("Child class method"); 
		
	}
	public void show()
	{
		super.display();
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		
		
		Class1 obj=new Class2(); 
		obj.print(25,35);// child print
		obj.display();
		//obj.show();  

		//Class1 o=new Class1();
		//o.show();
		
		
	}

}
