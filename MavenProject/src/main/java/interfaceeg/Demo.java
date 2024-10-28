package interfaceeg;

public class Demo implements Sample{

	
	public void show()
	{
		System.out.println();
	}
	public void s()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		
		Sample s=new Demo();
		s.show();
		
		
	}

	
}
