package encapsulationSample1;

public class Sample {

	public static void main(String[] args) {
		EncapsulationClass obj=new EncapsulationClass();
		
		
		/*obj.setAcc_no(647386);
		obj.setName("chithra");
		obj.setEmail("chithra34@gmail.com");
		System.out.println(obj.getAcc_no());
		System.out.println(obj.getName());
		System.out.println(obj.getEmail());*/
		
		
		obj.setter(1375863456,"Athira","athira88@gmail.com");
		obj.getter();
		
	}

}
