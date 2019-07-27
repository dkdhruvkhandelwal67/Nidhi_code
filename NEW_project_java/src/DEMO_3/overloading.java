package DEMO_3;

public class overloading {
	

	public static void CAR(int x,String str)
	{
		System.out.println(x);
		System.out.println(str);

	}

	public static void CAR(int x,String str,int y)
	{
		System.out.println(x);
		System.out.println(str);
		System.out.println(y);

	}

	public static void main(String[] args) {
		overloading.CAR(3, "Nidhi");
		overloading.CAR(5, "Nidhi_test", 9);


	}

}
