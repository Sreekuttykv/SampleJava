package encapsulationSample1;

public class EncapsulationClass {

	private long acc_no;
	private String name;
	private String email;
	
	/*public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	*/
	
	

	public void setter(long acc_no,String name,String email)
	{
		this.acc_no=acc_no;
		this.email=email;
		this.name=name;
	}

	public void getter()
	{
		System.out.println("Accout Number:"+acc_no);
		System.out.println("Name:"+name);
		System.out.println("Email ID:"+email);
	
	}
}
	