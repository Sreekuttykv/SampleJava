package sbiassignment;

import rbipackage.RBIbank;

public class SBI implements RBIbank{

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
		public double interest(double principal_amt,int years,double interest_rate )
		{
			double si=(principal_amt*interest_rate*years)/100;
			return si;
		}
		

	}


