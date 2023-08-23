package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtils;

public class Logout {
	
	public WebDriver driver;
	public PageUtils pu;
	@FindBy(xpath="//a[text()='Logout']")WebElement logout;
	
	public Logout(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
		pu = new PageUtils(driver);
		
	}
	public void clickLogout() throws Exception {
//		Thread.sleep(7000);
//		logout.click();
		pu.waitForElement(logout);
		pu.clickOnElement(logout);
	}

}
