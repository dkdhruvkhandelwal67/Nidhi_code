package DEMO_3;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Keywords_2 extends Keywords{

	String data_str = "str";
	
	public void modify()
	{
		String data ;
		String data2 ;
		
		data = super.data_str;
		data2=this.data_str;
		
		System.out.println("superclass-->" + data);
		System.out.println("currentlass-->" + data2);

	}
	
	//Polymorphism overriding.....................
	public void cars()
	{
		System.out.println("MY child class obj");
	}
	
	public void overloading_test()
	{
		this.cars();
		super.cars();
	}
	//Polymorphism overriding.....................

	
	public static void main(String[] args) {
		
		Keywords_2 obj = new Keywords_2();
		obj.modify();
		
		
		//Polymorphism overriding.....................
		
		obj.overloading_test();
		//Polymorphism overriding.....................


		

	}

}
