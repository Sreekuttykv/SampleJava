package superassignment;

public class Class2 extends Class1{
	public void div()
	{
		int result=super.add(3, 70);
		if(result%10==0)
		{
			System.out.println("The result is divisible by 10");
		}
		else
		{
			System.out.println("The result is not divisible by 10");
		}
	}

	public static void main(String[] args) {
	
		Class2 c=new Class2();
		c.div();
		String s="sac";
		System.out.println(s.concat("hi").concat("hg").concat("67"));
	}

}
