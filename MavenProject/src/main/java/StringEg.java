
public class StringEg {

	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		String n="10";
		String n3="20";
		String s1="welcome";
		String s2=new String("java");
		String s3=new String("welcome");
		String s4="welcome";
		String s5=new String("WELCOME");
		String s6="java is simple and powerful";
		String s7="WELCO     ME  ";
		
	
		
		System.out.println("Hello world");
		System.out.println(a+b+n+b+a);
		System.out.println("equals method");
		System.out.println(s1.equals(n));  //false
		System.out.println(s1.equals(s3));  //true only check for content
		System.out.println(s1.equals(s7));  //false check case
		System.out.println(s1.equalsIgnoreCase(s5)); //true Ignorecase
		
		
		System.out.println(s1.concat(n));
		
		System.out.println("= operator:");
		System.out.println(s1==n);    //false
		System.out.println(s1==s3);  //false  same content but check reference
		System.out.println(s1==s4);
		
		System.out.println("Compare to method");
		System.out.println(s1.compareTo(n));   //pos s1>n
		System.out.println(n.compareTo(s1));   //neg  n<s1
		System.out.println(s1.compareTo(s3)); //0
		System.out.println(s1.compareTo(s4));  //0
		System.out.println(s1.compareTo(s7)); //positive Check case
		
		
		
		System.out.println(s1.charAt(5));
		n=n.concat("cs department");
		System.out.println(n);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s7.trim());
		System.out.println(s6.contains("is"));
		System.out.println(s1.endsWith("se"));
		
		
		
		String s9=new String("java");
		StringBuilder sb2=new StringBuilder(s9);
		StringBuffer sb7=new StringBuffer(s9);
		
		
		
		
		System.out.println("String Buffer");
		StringBuffer sb1=new StringBuffer("hello");
		sb1.toString();
	
		
		
		StringBuilder sb4=new StringBuilder("hello");
		sb2.toString();
		
		
		System.out.println("capacity");
		StringBuilder sb5=new StringBuilder();
		sb5.ensureCapacity(20);
		System.out.println(sb5.capacity());   //50
		sb5.append("welcome33eeeeeeeeeeeeeeeeeeeeeeeeeee");       //50*2+2=102
		System.out.println(sb5.capacity());
		
		System.out.println("after ensure");
		System.out.println(sb5.capacity());
		
		
		StringBuffer sb=new StringBuffer("python ");   //16+7=23
		System.out.println(sb.capacity());    //
		System.out.println(sb1.capacity());   //def 16+hello =21
		System.out.println(sb1.append("hii         welcome"));
		System.out.println(sb1.capacity());  //old*2+2  44(42+2)
		
		
	
	}

}
