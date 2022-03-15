package Automation.Sports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	public WebDriver initializeDriver()
	{
		String browserName = "chrome";
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","src\\main\\java\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("internetExplorer"))
		{
			//Set property for IE driver
			driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//Set property for firefox driver
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		return driver;
	}
}
