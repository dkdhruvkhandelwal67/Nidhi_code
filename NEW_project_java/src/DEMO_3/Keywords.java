package DEMO_3;

public class Keywords {
	
	static int data ;
	static String str;
	 String data_str ="string";
	
	
	public Keywords() {
		
		this.data =5;
	}
	
	public void cars()
	{
		System.out.println("MY parent class obj");
	}

	public static void main(String[] args) {

		Keywords key = new Keywords();

		
		System.out.println(data);
		System.out.println(str);
	}

}
