package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.Logout;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public Logout lo;
	public Properties configProp;
}
