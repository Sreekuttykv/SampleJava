package abstractSample;

public class VideoSearch extends Google{
	public void search()
	{
		System.out.println("Video searching...");
	}
	public void printSearch()
	{
		System.out.println("Video search method");
	}
	public void display()
	{
		System.out.println(" Video Displaying...");
	}
	

	public static void main(String[] args) {
		VideoSearch v=new VideoSearch();
		v.search();
		v.printSearch();
		v.display();
		ImageSearch obj=new ImageSearch();
		obj.search();
		obj.hello();
		obj.display();
		GoogleFull g=new GoogleFull();
		g.search();
		g.print();
		g.show();
		g.display();
		
	}

}
