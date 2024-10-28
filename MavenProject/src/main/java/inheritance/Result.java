package inheritance;

public class Result extends Addition{

	public void check()
	{
		super.add(50,4);
		if(sum%10==0)
		{
			System.out.println("Result is divisible by 10");
		}
		else
		{
			System.out.println("Result is not divisible by 10");
		}
	}
	public static void main(String[] args) {
		Result r=new Result();
		r.check();
	}

}
 