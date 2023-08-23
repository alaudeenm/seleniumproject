package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtils {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public PageUtils(WebDriver ldriver) {
		driver = ldriver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
	}
	public void enterText(String Text,WebElement we) {
		we.sendKeys(Text);
	}
	
	public boolean clearAndenterText(String Text,WebElement we) {
		we.clear();
		we.sendKeys(Text);
		return true ;
	}
	
	public boolean clickOnElement(WebElement we) {
		we.click();
		return true;
	}
	
	public void waitForElement(WebElement we) {
		wait.until(ExpectedConditions.visibilityOf(we));
		
	}
}

