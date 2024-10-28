package encapsulationsample;

public class Address {
	
	int houseNo;
	String houseName;
	int pincode;
	Student std;
	public Address(int houseNo,String houseName,int pincode,Student std)
	{
		this.houseNo=houseNo;
		this.houseName=houseName;
		this.pincode=pincode;
		this.std=std;
	}
	public void display()
	{
		System.out.println("Name :"+std.name);
		System.out.println("Rollno :"+std.rollno);
		System.out.println("House Number:"+houseNo);
		System.out.println("House Name :"+houseName);
		System.out.println("Pin code :"+pincode);
		
	}
	

}
