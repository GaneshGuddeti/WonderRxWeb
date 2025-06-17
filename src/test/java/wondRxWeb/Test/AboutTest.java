package wondRxWeb.Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wondRxWeb.TestComponents.BaseTestComponents;

public class AboutTest extends BaseTestComponents{
	
	// Verifying total links on the web page, page title, & url
	@Test
	public void aboutInfo()
	{
		List<WebElement> links = aboutPage.getAllLinks();
		System.out.println("Total number of links " +links.size());
		String actualTitle = (aboutPage.getTitle());
		softAssert.assertEquals(actualTitle, "WONDRx | Smart Rx Kit that digitizes your Rx in No Time!");
		String actualUrl = aboutPage.currentURL();
		softAssert.assertEquals(actualUrl, "https://www.wondrx.com/about");
	}
	
	// Verifying Header navigation links
	@Test
	public void verifyHeaderNavigationLinks()
	{
		softAssert.assertTrue(aboutPage.isLogoLinkVisibleAndEnabled(), "Brand Logo link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isAboutHeaderLinkVisibleAndEnabled(), "Header About link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isDoctorsHeaderLinkVisibleAndEnabled(), "Header Doctors link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isConsumersHeaderLinkVisibleAndEnabled(), "Header Consumers link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isProvidersHeaderLinkVisibleAndEnabled(), "Header Providers link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isBlogsHeaderLinkVisibleAndEnabled(), "Header Blogs link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isFaqsHeaderLinkVisibleAndEnabled(), "Header FAQ's link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isContactUsLinkVisibleAndEnabled(), "Header Contact Us link is not visible or not enabled");
		
		softAssert.assertAll();
	}
	
	// Verifying page Text & Images
	@Test
	public void verifyBannersAndMessagesOnThePage()
	{
		softAssert.assertTrue(aboutPage.isAboutUsBannerVisible(), "About Us banner is not visible");
		softAssert.assertTrue(aboutPage.isWhoAreWeTextVisible(), "Who Are We message is not visible");
		softAssert.assertTrue(aboutPage.isVisionWeHaveTextVisible(), "Vision We Have message is not visible");
		softAssert.assertTrue(aboutPage.isMissionWeAreOnBannerVisible(), "Mission We Are On banner is not visible");
		
		softAssert.assertAll();
	}
	
	// Verifying Footer navigation links
	@Test
	public void verifyFooterNavigationLinks()
	{
		softAssert.assertTrue(aboutPage.isAboutFooterLinkVisibleAndEnabled(), "Footer About link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isDoctorsFooterLinkVisibleAndEnabled(), "Footer Doctors link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isConsumersFooterLinkVisibleAndEnabled(), "Footer Consumers link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isProvidersFooterLinkVisibleAndEnabled(), "Footer Providers link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isBlogsFooterLinkVisibleAndEnabled(), "Footer Blogs link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isFaqsFooterLinkVisibleAndEnabled(), "Footer FAQ's link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isPrivacyPolicyFooterLinkVisibleAndEnabled(), "Footer privacy Policy link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isTermsAndConditionsFooterLinkVisibleAndEnabled(), "Footer Terms & Confitions link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isLinkedInFooterLinkVisibleAndEnabled(), "Footer LinkedIn link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isFacebookFooterLinkVisibleAndEnabled(), "Footer Facebook link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isYoutubeFooterLinkVisibleAndEnabled(), "Footer Youtube link is not visible or not enabled");
		softAssert.assertTrue(aboutPage.isInstagramFooterLinkVisibleAndEnabled(), "Footer LinkedIn link is not visible or not enabled");
		
		softAssert.assertAll();
	}
	
	
}
