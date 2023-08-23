package pageObjects;


//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.PageUtils;

public class LoginPage {
	public WebDriver driver;
	public PageUtils pu;
	
	
	@FindBy(xpath="//input[@id='Email']")private WebElement userId;
	@FindBy(xpath="//input[@id='Password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement loginBtn;
	//private By userID=By.xpath("//input[@id='Email']");
	
	public LoginPage(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
		pu = new PageUtils(ldriver);
		
	}
	
//	@SuppressWarnings("deprecation")
	public void setUsername(String username) {
		Assert.assertTrue(pu.clearAndenterText(username, userId), "username is not entered");
//		Assert.assertTrue("username is not entered",pu.clearAndenterText(username, userId));
//		Assert.assertTrue("username is not entered", pu.clearAndenterText(username, userId));
	}

//	@SuppressWarnings("deprecation")
	public void setPassword(String pwd) {
//		password.clear();
//		password.sendKeys(pwd);
//		pu.clear_enterText(pwd, password);
//		Assert.assertTrue("password is not entered",pu.clearAndenterText(pwd, password));
		Assert.assertTrue(pu.clearAndenterText(pwd, password),"password is not entered");
	}
	
	public void clickLoginButton() {
//		loginBtn.click();
//		Assert.assertTrue("Login button is not clicked",pu.clickOnElement(loginBtn));
		Assert.assertTrue(pu.clickOnElement(loginBtn),"Login button is not clicked");
	}
}
