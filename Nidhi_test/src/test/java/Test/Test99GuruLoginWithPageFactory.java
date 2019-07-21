package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Guru99HomePage;
import Page.Guru99Login;




public class Test99GuruLoginWithPageFactory {

	WebDriver driver;
	Page.Guru99Login objLogin;
	Page.Guru99HomePage objHomePage;
	static String URL_link;
	
	@BeforeTest
	public void setup() throws FileNotFoundException, IOException{
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\TEST_newPace\\Nidhi_test\\src\\main\\resourse\\Config.properties"));
		URL_link=prop.getProperty("URL");
        System.setProperty("webdriver.gecko.driver","C:\\TEST_newPace\\Nidhi_test\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL_link);
	}

	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		//Create Login Page object
	objLogin = new Guru99Login(driver);
	//Verify login page title
	String loginPageTitle = objLogin.getLoginTitle();
	Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	//login to application
	objLogin.loginToGuru99("mgr123", "mgr!23");
	// go the next page
	objHomePage = new Guru99HomePage(driver);
	//Verify home page
	Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	}
	
	@AfterTest
	public void close_brower()
	{
		driver.close();
	}
}
