 package user;
import sbiassignment.SBI;
import federal.Federal; 
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import sbiassignment.SBI;
import java.util.*; 

public class User {
	 
    XSSFSheet sheet;
	public void ReadBank()throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\SREEKUTTY K V\\git\\TestMaven\\SampleJavaProject\\src\\main\\resources\\Bank.xlsx");
		XSSFWorkbook x=new XSSFWorkbook(file);
		sheet=x.getSheet("Sheet1");
		x.close();
	}
	public void readSBI()
	{
		SBI obj1=new SBI();
		Cell c1=sheet.getRow(1).getCell(0);
		Cell c2=sheet.getRow(1).getCell(1);
		Cell c3=sheet.getRow(1).getCell(2);
		double pa1=c1.getNumericCellValue();
		int y1=(int) c2.getNumericCellValue();
		double ri1=c3.getNumericCellValue();
		double si=obj1.interest(pa1,y1,ri1);
		System.out.println("Simple Interest: "+si);
	
	}
	public void readFederal()
	{
		Federal obj2=new Federal();
		Cell c1=sheet.getRow(2).getCell(0);
		Cell c2=sheet.getRow(2).getCell(1);
		Cell c3=sheet.getRow(2).getCell(2);
		double pa2=c1.getNumericCellValue();
		int y2=(int) c2.getNumericCellValue();
		double ri2=c3.getNumericCellValue();
		System.out.println("Simple Interest: "+obj2.interest(pa2,y2,ri2));
	}
	public void chooseBank()throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdrawal amount: ");
		int withdrawal_amt=sc.nextInt();
		
		System.out.println("Enter the option:");
		System.out.println("1.SBI");
		System.out.println("2.Federal");
		int c=sc.nextInt();
		
		User obj=new User();
		obj.ReadBank();
		switch(c)
		{
			case 1: 
				SBI s=new SBI();
				s.withdrawal(withdrawal_amt);
				obj.readSBI();
				break;
			case 2:
				Federal f=new Federal();
				f.withdrawal(withdrawal_amt);
				obj.readFederal();
				break;
			default:
				System.out.println("Invalid option");
				break;
		}
		sc.close();
		}
		 
		
			

	public static void main(String[] args)throws IOException {
		
		User u=new User();
		u.chooseBank();

	}
 
}
