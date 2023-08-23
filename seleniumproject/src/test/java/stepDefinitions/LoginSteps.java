package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
import pageObjects.Logout;

public class LoginSteps extends BaseClass{
	
	@Before
	public void setup() throws IOException {
		configProp = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		configProp.load(fis);
		String browser = configProp.getProperty("browser");
		
		if(browser.contentEquals("edge")) {
			
			EdgeOptions eo= new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			eo.addArguments("--no-sandbox");
			eo.addArguments("--disable-dev-shm-usage");
			eo.addArguments("--remote-allow-origins=*");
			eo.addArguments("--disable-gpu");
			
			driver = new EdgeDriver(eo);
			
		}
		else if (browser.contentEquals("chrome")) {
			
			ChromeOptions co = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			co.addArguments("--no-sandbox");
			co.addArguments("--disable-dev-shm-usage");
			co.addArguments("--remote-allow-origins=*");
			co.addArguments("--disable-gpu");
			driver = new ChromeDriver(co);
			
		}
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("user launch the Chrome browser")
	public void user_launch_the_chrome_browser() {

		
//		ChromeOptions co = new ChromeOptions();
//		EdgeOptions eo= new EdgeOptions();
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.edgedriver().setup();
//		eo.addArguments("--no-sandbox");
//		eo.addArguments("--disable-dev-shm-usage");
//		eo.addArguments("--remote-allow-origins=*");
//
//		eo.addArguments("--disable-gpu");
//		
//		co.addArguments("--no-sandbox");
////		co.addArguments("--disable-dev-shm-usage");
////		co.addArguments("--remote-allow-origins=*");
////
////		co.addArguments("--disable-gpu");
//
//		driver = new EdgeDriver(eo);
////		driver.manage().window().maximize();
////		driver = new ChromeDriver(co);
			    
	    
	}

	@Given("user open the URL {string}")
	public void user_open_the_url(String url) {
		driver.get(configProp.getProperty("URL"));
	    
	    //driver.get(url);
	    
	}
	
	@Given("user enters {string} and password {string}")
	public void user_enters_and_password(String username, String password) {
		lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		
	}
	
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		lp.clickLoginButton();
	}
	@Then("user clicks on logout button")
	public void user_clicks_logout_button() throws Exception {
		lo=new Logout(driver);
		lo.clickLogout();
	}
}
