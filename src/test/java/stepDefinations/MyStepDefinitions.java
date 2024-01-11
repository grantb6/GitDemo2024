package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import resources.base;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

public class MyStepDefinitions {

	WebDriver driver = null;

	@Given("^Initialise the browser with chrome$")

	public void initialise_the_browser_with_chrome() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "//Users//funso//Documents//Selenium//chromedriver75//chromedriver");

		driver = new ChromeDriver();

		driver.navigate().to("https://www.bt.com/");

		// driver.get("https://www.bt.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/button[2]")).click();

	}

	@When("^User enters Username as  \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_username_as_something_and_password_as_something(String strArg1, String strArg2)
			throws Throwable {

		driver.findElement(By.xpath("//input[@name = 'USER']")).sendKeys("babb175@yahoo.co.uk");

		driver.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("Whisky888");

	}

	@Then("^User should successfully login$")
	public void user_should_successfully_login() throws Throwable {

		if (driver.getCurrentUrl().equalsIgnoreCase(

				"https://my.bt.com/s/apps/appspackages/?siteArea=con.mya&s_cid=con_FURL_mybt#/home")) {
			System.out.println("Test pass");
		} else

		{
			System.out.println("Test failed");
		}

		driver.close();
	}

	@And("^navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {

		driver.findElement(By.linkText("My BT")).click();
	}

	@And("^Clck on Login link in home page to land on Secure sign in Page$")
	public void clck_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		driver.findElement(By.linkText("Log in")).click();
	}

	@And("^User clicks Submit tab$")
	public void user_clicks_submit_tab() throws Throwable {
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

}