package Demo;

public class Access_modifier {
	
	
	static public int testdata = 4;
	static private int testdata1=5;
	static protected int testdata2 =6;
	static int testdata4 =25;
	
	
	 public static void testproperty()
	{
		System.out.println("print test 1");
		System.out.println(testdata);
		System.out.println(testdata2);
	}
	 
	  static void testproperty4()
		{
			System.out.println("print test default");
		}
	 
	 private  static void testproperty1()
		{
			System.out.println("print test 4");
		}
	 
	 protected static void testproperty2()
		{
			System.out.println("print test 5");
		}
	
	 public static void main(String[] args) {
		 Access_modifier.testproperty1();
	 }
	 }


