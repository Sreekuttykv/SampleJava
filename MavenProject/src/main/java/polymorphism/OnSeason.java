package polymorphism;
import java.util.Scanner;

public class OnSeason {
	int purchaseAmt;
	public void discount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price");
		purchaseAmt=sc.nextInt();
		int discount=(purchaseAmt*40)/100;
		int finalPrice=purchaseAmt-discount;
		System.out.println("Discount= "+discount);
		System.out.println("Final price in OnSeason= "+finalPrice);
		
	}
}








//Program to calculate discount If customer purchase clothes on Offseason, set discount 15% and on Onseason 40%  Should use two classes,
//Onseason and Offseason  Use two methods- discount(method name should be same)