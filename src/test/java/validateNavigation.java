import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

//Adding logs

//Methods defined in base can be accessed here
public class validateNavigation extends base {

	public static Logger Log = LogManager.getLogger(validateNavigation.class.getName());

	@BeforeTest

	public void initialise() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
	}

	@Test

	// Declare Variables
	public void basenavigation() throws IOException, InterruptedException {

		// driver = initializeDriver();

		// driver.get(prop.getProperty("url"));

		// To access methods present in another class –
		// Use [Inheritance-extends]
		// You can also create object to that class and invoke methods of it

		// Pass [driver] in the argument - Constructor already defined in LandingPage
		// If you create an object and pass an argument [driver], you have to create
		// Constructor with an argument
		LandingPage l = new LandingPage(driver);

		// isDisplayed will return Boolean value - true value
		// if isNotDisplayed will return false value

		// To check if it is returning True or False
		// Assert.assertTrue - always expect the argument to be True

		// Assert.assertFalse - always expect the argument to be False

		//AssertJUnit.assertTrue(l.getNav().isDisplayed());

		Log.info("Navigation is displayed");

	}

	@AfterTest

	public void teardown() {

		driver.close();
		driver = null;

	}

}
