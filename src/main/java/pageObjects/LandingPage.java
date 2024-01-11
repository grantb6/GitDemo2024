package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	// Objects defined

	public WebDriver driver;

	By alert = By.xpath("/html/body/div[4]/div/div/div/div/button[2]");

	By BTclick = By.linkText("My BT");

	By Login = By.linkText("Log in");

	By User = By.name("USER");

	By Pass = By.name("PASSWORD");

	By Submit = By.xpath("//input[@type = 'submit']");

	//By Title = By.xpath("//*[@id=\"content\"]/div/div/h2");

	//By Nav = By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul");

	// Methods defined

	// Constructor defined

	public LandingPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getalert()

	{
		return driver.findElement(alert);
	}

	public WebElement getBTclick()

	{
		return driver.findElement(BTclick);
	}

	public WebElement getLogin()

	{
		return driver.findElement(Login);
	}

	public WebElement getUser()

	{
		return driver.findElement(User);
	}

	public WebElement getPass()

	{
		return driver.findElement(Pass);
	}

	public WebElement getSubmit()

	{
		return driver.findElement(Submit);
	}
	
	/*

	public WebElement getTitle()

	{
		return driver.findElement(Title);
	}
	
	*/

	/*
	public WebElement getNav()

	{
		return driver.findElement(Nav);
	}
	
	*/
}
