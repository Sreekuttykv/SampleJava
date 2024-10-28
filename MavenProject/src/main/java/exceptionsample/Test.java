package exceptionsample;

public class Test {
	
	public static void validate(int age)throws LicenceException
	{
		if(age<18)
		{
			throw new LicenceException("Not Eligible for driving licence");
		}
		else
		{
			System.out.println("Licence approved");
		}
	}

	public static void main(String[] args) {
		
          
              
            try 
            {
				Test.validate(27);
			} 
            catch (LicenceException e) {
				
				System.out.println(e);
			} 
       
  
        System.out.println("Rest of the code...");    
		

	}

}
