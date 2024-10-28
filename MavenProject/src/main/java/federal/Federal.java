package federal;

import rbipackage.RBIbank;

public class Federal implements RBIbank {
	public void withdrawal(int withdrawal_amt)
	{
		if(withdrawal_amt>50000)
		{
			System.out.println("Need pan card");
		}
		else
		{
			System.out.println("No need of pan card");
		}
	}
	public double interest(double principal_amt,int years,double interest )
	{
		double ci=principal_amt*Math.pow(1+interest/100,years);
		return ci;
		
	}

}

