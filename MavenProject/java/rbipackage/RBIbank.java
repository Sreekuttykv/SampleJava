package rbipackage;

public interface RBIbank {
	
	public abstract void withdrawal(int withdrawal_amt);
	public abstract double interest(double principal_amt,int years,double interest_rate);
   
	  
}
