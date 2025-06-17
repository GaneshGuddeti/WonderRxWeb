package wondRxWeb.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import wondRxWeb.TestComponents.BaseTestComponents;

public class BrokenLinksTest extends BaseTestComponents{

	//Verifying Broken links on the page
	@Test
	 public void brokenLinks()
	    {
		List<WebElement>links=aboutPage.getAllLinks();
				for(WebElement link : links)
			{
				String url = link.getAttribute("href");		
				try {
				    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				    connection.setRequestMethod("GET");
				    connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");// Pretend to be a browser
				    connection.setConnectTimeout(5000);
				    connection.connect();
				    int responseCode = connection.getResponseCode();

				    if (responseCode >= 400) {
				    softAssert.assertTrue(false, "The link with the text " + link.getText() + " with the response code " + responseCode + " has failed");
				    
				    } else {
				       System.out.println("Valid link: " + link.getText() + " with the response Code: " + responseCode);
				    }
				    connection.disconnect();
				}
				catch (Exception e) {
					softAssert.assertTrue(false, "The link with the text " + link.getText() + " threw an exception: " + e.getMessage());
				}
			}
				softAssert.assertAll();
	    }
}
