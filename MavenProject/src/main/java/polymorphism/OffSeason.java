package polymorphism;

import java.util.Scanner;

public class OffSeason extends OnSeason{
	int purchaseAmt;
	public void discount()
	{
		//super.discount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price");
		purchaseAmt=sc.nextInt();
		int discount=(purchaseAmt*15)/100;
		int finalPrice=purchaseAmt-discount;
		System.out.println("Discount= "+discount);
		System.out.println("Final price in OffSeason= "+finalPrice);
	}
	public void option()
	{
		while(true)
		{
		
			OffSeason obj=new OffSeason();
			System.out.println("Purchasing...");
			System.out.println("1. Offseason");
			System.out.println("2. Onseason");
			System.out.println("3. Exit");
			System.out.println("Enter your option");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					discount();
					break;
				case 2:
					super.discount();
				case 3:
					System.exit(0);
				default:
					System.out.println("Wrong option");
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		OffSeason obj=new OffSeason();
		obj.option();
		
	}
}
