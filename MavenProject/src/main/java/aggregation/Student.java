package aggregation;

public class Student {
	String name;
	int rollNo;
	Address a;

	public Student(String name,int rollNo,Address a)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.a=a;
		
	}
	public void display()
	{
		//a.show();
		System.out.println("Name:"+name);
		System.out.println("RollNo:"+rollNo);
		System.out.println("House Number:"+a.houseNo);
		System.out.println("House Name:"+a.houseName);
		System.out.println("Pin code:"+a.pincode);
		System.out.println("City:"+a.city);	
		
	}
	public static void main(String args[])
	{
		Address obj=new Address(207,"ABC",680306,"Thrissur");
		Student s=new Student("Anu",103,obj);
		s.display();
		//a.show();
	
	}
	
}






























	/*String name;
	int rollno;
	Address a;
	public Student(String name,int rollno,Address a)
	{
		this.name=name;
		this.rollno=rollno;
		this.a=a;
		
	}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("House Number:"+a.houseNo);
		System.out.println("House Name :"+a.houseName);
		System.out.println("Pin code :"+a.pincode);
		
	}  
	public static void main(String[] args) {
		Address obj=new Address(101,"abcgj",680306);
		obj.hi();
		Student s=new Student("Anu",23,obj);
		s.display();
		
	}
	
}*/
