package exceptionsample;

import java.io.IOException;

//Unchecked Exception
public class ThrowsEg2 {
	
	public static void m()throws ArrayIndexOutOfBoundsException
	{
		throw new ArrayIndexOutOfBoundsException();
		
	}
	
	
	public static void main(String[] args)  {
		
		m();
		
	}
		
}

