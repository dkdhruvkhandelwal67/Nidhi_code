package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_element {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\TEST_newPace\\TEST_nidhi\\lib\\geckodriver.exe" );

		WebDriver driver = new FirefoxDriver();//used to open browser instance
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Automation testing");
		
		List<WebElement> element = driver.findElements(By.xpath("//input[@aria-label='Google Search']"));
		
		element.get(1).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.close();
	}

}
