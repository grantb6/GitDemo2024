package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class base {

	// public WebDriver driver = null;

	public static WebDriver driver;
	public Properties prop;

	@Test
	public WebDriver initializeDriver() throws IOException {

		// Properties prop = new Properties ();

		prop = new Properties();

		FileInputStream fil = new FileInputStream(
				"//Users//funso//eclipse-workspace//new//E2EProjectN//src//main//java//resources//datadrive.properties");

		prop.load(fil);

		if (prop.getProperty("browser").equals("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "//Users//funso//Documents//Selenium//chromedriver75//chromedriver");
			

		
			driver = new ChromeDriver();
		}

		else if (prop.getProperty("browser").equals("firefox"))

		{
			driver = new FirefoxDriver();
		}

		else

		{
			driver = new InternetExplorerDriver();
		}

		return driver;

	}

	// To take screenshots

	public void getScreenshot(String result) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("//Users//funso//Documents//screenshot.png"));

	}

}
