package encapsulationsample;

public class Details {

	public static void main(String[] args) {
		Student s=new Student("Anu",101);
		Address a=new Address(520,"Koothupalakkal House",680306,s);
		a.display();
	}

}
