package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_test {

	public static void main(String[] args) {
		
		String URL;
		
        System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_nidhi/lib/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.xpath("//a[@href='#flights']")).click();
		driver.navigate().refresh();
		
		URL = driver.getTitle();
		System.out.println(URL);
		driver.close();

	}

}
