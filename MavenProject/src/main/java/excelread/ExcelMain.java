package excelread;
import java.io.IOException;
public class ExcelMain {

	public static void main(String[] args)throws IOException {
		ExcelFileRead obj=new ExcelFileRead();
		obj.readFile();
		String value=obj.readData(2,1);
		System.out.println("data: "+value);
	}

}
