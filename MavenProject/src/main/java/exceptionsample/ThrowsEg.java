package exceptionsample;

import java.io.IOException;
import java.sql.SQLException;

//checked Exception  -so use try catch or declare using throws
public class ThrowsEg {
	
	public static void M()throws IOException
	{
		throw new IOException("Device Error");
	}

	public static void main(String[] args)  {
		
		
		try {
			ThrowsEg.M();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
			
			System.out.println("code");
		
		
	}

	
}



