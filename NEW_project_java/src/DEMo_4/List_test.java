package DEMo_4;

import java.util.ArrayList;
import java.util.List;

public class List_test {

	public static void main(String[] args) {
		
		
		List<String>ls = new ArrayList<>();
		ls.add("Nidhi1");
		ls.add("Nidhi2");
		ls.add("Nidhi3");
		ls.add("Nidhi4");
		
		//for each loop
		
		for(String st :ls)
		{
			System.out.println("data stored ina list >>>>" + st);
		}
		
		
		

		

	}

}
