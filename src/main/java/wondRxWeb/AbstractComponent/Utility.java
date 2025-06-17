package wondRxWeb.AbstractComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	WebDriver driver;
	
	
	public Utility(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Header PageFactory WebElements
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'about')]")
	WebElement aboutHeader;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'doctors')]")
	WebElement doctorsHeader;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'consumer')]")
	WebElement consumersHeader;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'providers')]")
	WebElement providersHeader;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'blogs')]")
	WebElement blogsHeader;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'faqs')]")
	WebElement faqHeader;
	
	@FindBy(css="img[id=marh]")
	WebElement logo;
	
	@FindBy(css="a[class='active1']")
	WebElement contactUs;
	
	//Footer PageFactory WebElement
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'about')]")
	WebElement aboutFooter;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'doctors')]")
	WebElement doctorsFooter;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'consumers')]")
	WebElement consumersFooter;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'providers')]")
	WebElement providersFooter;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'blogs')]")
	WebElement blogsFooter;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'faqs')]")
	WebElement faqFooter;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'privacy')]")
	WebElement privacyFooter;
	
	@FindBy(xpath="(//ul[@id='head'])[1] //a[contains(@href,'terms')]")
	WebElement termsFooter;
	
	//parameterized JavaScript Executor
	public void javaScriptExecutor(String script, Object... args)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
	}
	
	// Explicit wait with By locator
	public void waitForElementToAppear(By findBy)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	// Explicit wait with WebElement
	public void waitForWebElementToAppear(WebElement findBy)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	// Click on Brand icon to go to home Page
	public void goToHeaderHomePage()
	{
		logo.click();
	}
	
	// Click on Contact us 
	public void goToContactUsPage()
	{
		contactUs.click();
	}
	
	public void goToHeaderAboutPage()
	{
		aboutHeader.click();
	}
	
	public void goToHeaderDoctorsPage()
	{
		doctorsHeader.click();
	}
	
	public void goToHeaderConsumerPage()
	{
		consumersHeader.click();
	}
	
	public void goToHeaderProvidersPage()
	{
		providersHeader.click();
	}
	
	public void goTOHeaderBlogsPage()
	{
		blogsHeader.click();
	}
	
	public void goToHeaderFaqPage()
	{
		faqHeader.click();
	}
	
	public boolean isAboutHeaderLinkVisibleAndEnabled() {
		return aboutHeader.isDisplayed() && aboutHeader.isEnabled();
	}
	
	public boolean isDoctorsHeaderLinkVisibleAndEnabled() {
		return doctorsHeader.isDisplayed() && doctorsHeader.isEnabled();
	}
	
	public boolean isConsumersHeaderLinkVisibleAndEnabled() {
		return consumersHeader.isDisplayed() && consumersHeader.isEnabled();
	}
	
	public boolean isProvidersHeaderLinkVisibleAndEnabled() {
		return providersHeader.isDisplayed() && providersHeader.isEnabled();
	}
	
	public boolean isBlogsHeaderLinkVisibleAndEnabled() {
		return blogsHeader.isDisplayed() && blogsHeader.isEnabled();
	}
	
	public boolean isFaqsHeaderLinkVisibleAndEnabled() {
		return faqHeader.isDisplayed() && faqHeader.isEnabled();
	}
	
	public boolean isLogoLinkVisibleAndEnabled() {
		return logo.isDisplayed() && logo.isEnabled();
	}
	
	public boolean isContactUsLinkVisibleAndEnabled() {
		return contactUs.isDisplayed() && contactUs.isEnabled();
	}
	
	//Footer
	public boolean isAboutFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(aboutFooter);
		return aboutFooter.isDisplayed() && aboutFooter.isEnabled();
	}
	
	public boolean isDoctorsFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(doctorsFooter);
		return doctorsFooter.isDisplayed() && doctorsFooter.isEnabled();
	}
	
	public boolean isConsumersFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(consumersFooter);
		return consumersFooter.isDisplayed() && consumersFooter.isEnabled();
	}
	
	public boolean isProvidersFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(providersFooter);
		return providersFooter.isDisplayed() && providersFooter.isEnabled();
	}
	
	public boolean isBlogsFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(blogsFooter);
		return blogsFooter.isDisplayed() && blogsFooter.isEnabled();
	}
	
	public boolean isFaqsFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(faqFooter);
		return faqFooter.isDisplayed() && faqFooter.isEnabled();
	}
	
	public boolean isPrivacyPolicyFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(privacyFooter);
		return privacyFooter.isDisplayed() && privacyFooter.isEnabled();
	}
	
	public boolean isTermsAndConditionsFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(termsFooter);
		return termsFooter.isDisplayed() && termsFooter.isEnabled();
	}
	
}
