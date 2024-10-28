package encapsulationsample;

public class AddressEncapsulation {
	private String houseName;
	private int houseNo;
	private int pincode;
	private StudentEncapsulation st;
	
	public StudentEncapsulation getSt() {
		return st;
	}
	public void setSt(StudentEncapsulation st) {
		this.st = st;
	} 
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void display()
	{
		System.out.println("Name :"+st.getName());
		System.out.println("Rollno :"+st.getRollno());
		System.out.println("House Number:"+getHouseNo());
		System.out.println("House Name :"+getHouseName());
		System.out.println("Pin code :"+getPincode());
	}
	
}
