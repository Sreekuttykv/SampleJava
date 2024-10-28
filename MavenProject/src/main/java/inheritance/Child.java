package inheritance;

public class Child extends Parent{
public void print()
{
	System.out.println("Hii");
	
}
public static void main(String args[])
{
	
	Child c=new Child();
	System.out.print(c.speed);
	c.print();
	c.display();
}

}
 