package inheritance;

public class Division extends Multiplication{
	public void div()
	{
		super.show();
		int div=a/b;
		System.out.println("Division= "+div);
	}
	public static void main(String args[])
	{
		Division d=new Division();
		d.sum();
		d.diff();
		d.mul();
		d.div();   
	}
} 

 