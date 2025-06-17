package wondRxWeb.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import wonderRxWeb.PageObjects.AboutPage;

public class BaseTestComponents {
	WebDriver driver;
	public AboutPage aboutPage;
	public SoftAssert softAssert = new SoftAssert();
	
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\wondRx\\Resources\\Global.properties");
		
		prop.load(file);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
	        options.setAcceptInsecureCerts(true); // <- Accepts untrusted certs
			driver = new ChromeDriver(options);
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			options.setAcceptInsecureCerts(true);
			driver = new FirefoxDriver(options);
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeClass
	public AboutPage launchBrowser() throws IOException
	{
		driver = initializeDriver();
		aboutPage = new AboutPage(driver);
		aboutPage.goTo();
		return aboutPage;
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
