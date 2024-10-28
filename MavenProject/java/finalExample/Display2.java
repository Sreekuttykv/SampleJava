package finalExample;

public class Display2 extends Display {

	public final void print()
	{
		System.out.println("final example");
	}
	public static void main(String[] args) {
		Display2 d=new Display2();
		d.print();

	}

}
