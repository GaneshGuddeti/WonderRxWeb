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

	public WebDriver driver;
	
	
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
	@FindBy(xpath="(//ul[@id='head1'])[1] //a[contains(@href,'about')]")
	WebElement aboutFooter;
	
	@FindBy(xpath="(//ul[@id='head1'])[1] //a[contains(@href,'doctors')]")
	WebElement doctorsFooter;
	
	@FindBy(xpath="(//ul[@id='head1'])[1] //a[contains(@href,'consumer')]")
	WebElement consumersFooter;
	
	@FindBy(xpath="(//ul[@id='head1'])[1] //a[contains(@href,'providers')]")
	WebElement providersFooter;
	
	@FindBy(xpath="(//ul[@id='head1'])[1] //a[contains(@href,'blogs')]")
	WebElement blogsFooter;
	
	@FindBy(xpath="(//ul[@id='head1'])[1] //a[contains(@href,'faqs')]")
	WebElement faqFooter;
	
	@FindBy(xpath="(//ul[@id='head1'])[1] //a[contains(@href,'privacy')]")
	WebElement privacyFooter;
	
	@FindBy(xpath="(//ul[@id='head1'])[1] //a[contains(@href,'terms')]")
	WebElement termsFooter;
	
	@FindBy(css="i[class='fab fa-linkedin']")
	WebElement linkedIn;
	
	@FindBy(css="i[class*='facebook']")
	WebElement facebook;
	
	@FindBy(css="i[class*='youtube']")
	WebElement youtube;
	
	@FindBy(css="i[class*='instagram']")
	WebElement instagram;
	
	
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
	
	// Click on Header About 
	public void goToHeaderAboutPage()
	{
		aboutHeader.click();
	}
	
	// Click on Header Doctors 
	public void goToHeaderDoctorsPage()
	{
		doctorsHeader.click();
	}
	
	// Click on Header Consumers 
	public void goToHeaderConsumerPage()
	{
		consumersHeader.click();
	}
	
	// Click on Header Providers 
	public void goToHeaderProvidersPage()
	{
		providersHeader.click();
	}
	
	// Click on Header Blogs 
	public void goTOHeaderBlogsPage()
	{
		blogsHeader.click();
	}
	
	// Click on Header FAQ's 
	public void goToHeaderFaqPage()
	{
		faqHeader.click();
	}
	
	// To check the About Header Link is Visible and Enabled
	public boolean isAboutHeaderLinkVisibleAndEnabled() {
		return aboutHeader.isDisplayed() && aboutHeader.isEnabled();
	}
	
	//To check the Doctors Header Link is Visible and Enabled
	public boolean isDoctorsHeaderLinkVisibleAndEnabled() {
		return doctorsHeader.isDisplayed() && doctorsHeader.isEnabled();
	}
	
	//To check the Consumers Header Link is Visible and Enabled
	public boolean isConsumersHeaderLinkVisibleAndEnabled() {
		return consumersHeader.isDisplayed() && consumersHeader.isEnabled();
	}
	
	//To check the Providers Header Link is Visible and Enabled
	public boolean isProvidersHeaderLinkVisibleAndEnabled() {
		return providersHeader.isDisplayed() && providersHeader.isEnabled();
	}
	
	//To check the Blogs Header Link is Visible and Enabled
	public boolean isBlogsHeaderLinkVisibleAndEnabled() {
		return blogsHeader.isDisplayed() && blogsHeader.isEnabled();
	}
	
	//To check the FAQ's Header Link is Visible and Enabled
	public boolean isFaqsHeaderLinkVisibleAndEnabled() {
		return faqHeader.isDisplayed() && faqHeader.isEnabled();
	}
	
	//To check the Logo Header Link is Visible and Enabled
	public boolean isLogoLinkVisibleAndEnabled() {
		return logo.isDisplayed() && logo.isEnabled();
	}
	
	//To check Contact us Header Link is Visible and Enabled
	public boolean isContactUsLinkVisibleAndEnabled() {
		return contactUs.isDisplayed() && contactUs.isEnabled();
	}
	
	//To check the About Footer Link is Visible and Enabled
	public boolean isAboutFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(aboutFooter);
		return aboutFooter.isDisplayed() && aboutFooter.isEnabled();
	}
	
	//To check the Doctors Footer Link is Visible and Enabled
	public boolean isDoctorsFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(doctorsFooter);
		return doctorsFooter.isDisplayed() && doctorsFooter.isEnabled();
	}
	
	//To check the Consumers Footer Link is Visible and Enabled
	public boolean isConsumersFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(consumersFooter);
		return consumersFooter.isDisplayed() && consumersFooter.isEnabled();
	}
	
	//To check the Providers Footer Link is Visible and Enabled
	public boolean isProvidersFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(providersFooter);
		return providersFooter.isDisplayed() && providersFooter.isEnabled();
	}
	
	//To check the Blogs Footer Link is Visible and Enabled
	public boolean isBlogsFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(blogsFooter);
		return blogsFooter.isDisplayed() && blogsFooter.isEnabled();
	}
	
	//To check the FAQ's Footer Link is Visible and Enabled
	public boolean isFaqsFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(faqFooter);
		return faqFooter.isDisplayed() && faqFooter.isEnabled();
	}
	
	//To check the Privacy Policy Footer Link is Visible and Enabled
	public boolean isPrivacyPolicyFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(privacyFooter);
		return privacyFooter.isDisplayed() && privacyFooter.isEnabled();
	}
	
	//To check the Terms & Conditions Footer Link is Visible and Enabled
	public boolean isTermsAndConditionsFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(termsFooter);
		return termsFooter.isDisplayed() && termsFooter.isEnabled();
	}
	
	//To check linkedIn Footer Link is Visible and Enabled
	public boolean isLinkedInFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(linkedIn);
		return linkedIn.isDisplayed() && linkedIn.isEnabled();
	}
	
	//To check Facebook Footer Link is Visible and Enabled
	public boolean isFacebookFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(facebook);
		return facebook.isDisplayed() && facebook.isEnabled();
	}
	
	//To check Youtube Footer Link is Visible and Enabled
		public boolean isYoutubeFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(youtube);
		return youtube.isDisplayed() && youtube.isEnabled();
	}
		
		//To check Instagram Footer Link is Visible and Enabled
		public boolean isInstagramFooterLinkVisibleAndEnabled() {
		javaScriptExecutor("window.scrollBy(0,3000)");
		waitForWebElementToAppear(instagram);
		return instagram.isDisplayed() && instagram.isEnabled();
	}
}
