package inheritance;



public class Total extends Hra{
	double salary;
	public void total()
	{

		salary=basic_pay+hra-pf-deduction+bonus;

	}
	public void salarySlip()
	{
		
		this.total();
		System.out.println("***Salary Slip***");
		System.out.println("Basic Pay: "+basic_pay);
		System.out.println("Deduction: "+deduction);
		System.out.println("Hra: "+hra);
		System.out.println("Pf: "+pf);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+salary);
		 
	}

	public static void main(String[] args) {
		Total t=new Total();
		t.total();
		t.basic();
		t.hra();
		t.salarySlip();

	}

}
     

