package propertiesEg;

import java.io.*;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("C:\\Users\\SREEKUTTY K V\\git\\Java\\SampleMaven\\src\\main\\resources\\data.properties");
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p.getProperty( "username"));
		System.out.println(p.getProperty("pswd"));
		
		/*
		p.setProperty("email", "sreekutty@gmail.com");
		p.setProperty("phn","9961189067");
		//FileWriter fw=new FileWriter("C:\\Users\\SREEKUTTY K V\\git\\Java\\SampleMaven\\src\\main\\resources\\data.properties");
		FileWriter fw=new FileWriter("info.properties");
		p.store(fw,"first commit");
		*/
		
		Properties pr=new Properties();
		pr.setProperty("email", "sreekutty@gmail.com");
		pr.setProperty("phn","9961189067");
		
		pr.store(new FileWriter("info.properties"),"first commit");
	}

} 

