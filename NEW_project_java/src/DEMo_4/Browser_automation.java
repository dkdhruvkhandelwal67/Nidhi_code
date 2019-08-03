package DEMo_4;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_automation {

	public static void main(String[] args) {
		int i=0;

		System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_Selenium/lib/geckodriver.exe" );

		WebDriver driver = new FirefoxDriver();//used to open browser instancer
		
		driver.get("https://www.flipkart.com/");
		
		//List used to collect all anchore tags and prints its links
		
		List<WebElement>ls = driver.findElements(By.xpath("//a"));
		
		System.out.println(ls.size());//print size of list
		
		for(WebElement web: ls) // iterate over each element of list until we reach to the last element of the list
		{
			System.out.println("LINKS--->" + web.getAttribute("href"));
			i++;
			if(i<=40)
			{
				continue;
			}
			else 
			{
				break;
			}
			
		}
		
		driver.close();
	}

}
