import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

//Methods defined in base can be accessed here
public class HomePage extends base {

	public static Logger Log = LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initialise() throws IOException {
		
		

		driver = initializeDriver();

		driver.get("https://www.bt.com/");
	}

	@Test(dataProvider = "getData")

	// Declare Variables
	public void basenavigation(String username, String password) throws IOException, InterruptedException {

		// driver = initializeDriver();
		// driver.get("https://www.bt.com/");

		// To access methods present in another class –
		// Use [Inheritance-extends]
		// You can also create object to that class and invoke methods of it

		// Pass [driver] in the argument - Constructor already defined in LandingPage
		// If you create an object and pass an argument [driver], you have to create
		// Constructor with an argument

		LandingPage l = new LandingPage(driver);

		l.getalert().click(); // OR
		// driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/button[2]")).click();

		l.getBTclick().click();
		l.getLogin().click();
		l.getUser().sendKeys("babb175@yahoo.co.uk");
		l.getPass().sendKeys("Whisky888");
		l.getSubmit().click();

		Log.info("Page successfully displayed");
	}

	@DataProvider

	public Object[][] getData()

	{
		Object[][] data = new Object[1][2];

		data[0][0] = "username";

		data[0][0] = "password";

		return data;
	}

	@AfterTest

	public void teardown() {

		driver.close();
		driver = null;

	}
}
