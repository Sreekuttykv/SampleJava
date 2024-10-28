package interfaceexample;
import java.util.Scanner;
public class HDFC implements RBI{
	
		public void recurringDeposit(int amt,int duration)
		{
			System.out.println("Interest rate: "+INTEREST);
			double final_amt=amt+(amt*INTEREST*duration)/100;
			System.out.println("Final Amount: "+final_amt);
		}
		public static void main(String[] args) {
			HDFC obj=new HDFC();
			obj.recurringDeposit(10000, 2);

	}

}
