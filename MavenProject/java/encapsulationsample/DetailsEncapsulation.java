package encapsulationsample;

public class DetailsEncapsulation {

	public static void main(String args[])
	{

		StudentEncapsulation s=new StudentEncapsulation();
		AddressEncapsulation a=new AddressEncapsulation();
		s.setName("Anu");
		s.setRollno(101);
		a.setHouseNo(123);
		a.setHouseName("Koothupalakkal House");
		a.setPincode(680306);
		a.setSt(s);
		a.display();
		
	}
}


