package wonderRxWeb.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wondRxWeb.AbstractComponent.Utility;


	public class AboutPage extends Utility{ //inherited Utility class 
		WebDriver driver;
		
		public AboutPage(WebDriver driver)
		{
			super(driver);
			//initialization of a constructor
			this.driver=driver;
			
			//PageFactory initialization
			PageFactory.initElements(driver, this);
		}
		//PageFactory WebElements
		@FindBy(tagName="a")
		List<WebElement> links;
		
		@FindBy(xpath = "(//p[@id='whoP'])[1]")
		WebElement whoAreWeText;
		
		@FindBy(xpath = "(//p[@id='whoP'])[2]")
		WebElement visionWeHaveText;
		
		@FindBy(xpath="(//img[@alt='about us'])[1]")
		WebElement aboutusBanner;
		
		@FindBy(xpath="(//img[@alt='about us'])[2]")
		WebElement mission;
		
		//Landing WebPage
		public void goTo()
		{
			driver.get("https://www.wondrx.com/about");
		}
		
		// WebPage Title
		public String getTitle()
		{
			String title = driver.getTitle();
			return title;
		}
		
		// WebPage URL
		public String currentURL()
		{
			String url = driver.getCurrentUrl();
			return url;
		}
		
		
	//Collecting all links of the About webpPge	
	public List<WebElement> getAllLinks()
	{
		return links;
	}
	
	//Verifying Banner visibility
	public boolean isAboutUsBannerVisible() {
        return aboutusBanner.isDisplayed();
    }
	
	//Verifying Text visibility
	public boolean isWhoAreWeTextVisible() {
        return whoAreWeText.isDisplayed();
    }
	
	//Verifying Text visibility
	public boolean isVisionWeHaveTextVisible() {
		javaScriptExecutor("window.scrollBy(0,800)");
		waitForWebElementToAppear(visionWeHaveText);
        return visionWeHaveText.isDisplayed();
    }
	
	//Verifying Banner visibility
	public boolean isMissionWeAreOnBannerVisible() {
		javaScriptExecutor("window.scrollBy(0,1700)");
		waitForWebElementToAppear(visionWeHaveText);
        return mission.isDisplayed();
    }
	

}
