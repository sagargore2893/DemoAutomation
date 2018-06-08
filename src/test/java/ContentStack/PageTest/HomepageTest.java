package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.Constants.URLs;
import ContentStack.PageLibrary.Homepage;

public class HomepageTest extends BaseTest {
	 
	Homepage homepage;
	
	@Test(priority=0)
	public void IsHomepageDisplayed() {
		
		URLs urls = new URLs();
		
		Assert.assertEquals(driver.getCurrentUrl(),urls.homepageUrl);
		
	}
	
	
	@Test(priority=1)
	public void VerifyRedircetionOfAllLinksFromHeaderTest() throws InterruptedException {
		
		homepage = new Homepage(driver);
		URLs urls = new URLs();
		
		homepage.ClickOnContentStackLogo();
		Assert.assertEquals(driver.getCurrentUrl(), urls.homepageUrl);
		
		homepage.ClickOnFeatureLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.featursUrl);
		driver.navigate().back();
		
		homepage.ClickOnTechnologyLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.technologyUrl);
		driver.navigate().back();
		
		homepage.ClickOnPricingLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.pricingUrl);
		driver.navigate().back();

		homepage.ClickOnPartners();
		Assert.assertEquals(driver.getCurrentUrl(), urls.partnersUrl);
		driver.navigate().back();

		homepage.ClickOnResourceCenterLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.resourceCenterUrl);
		driver.navigate().back();

		homepage.ClickOnROICalculatorLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.roiCalculatorUrl);
		driver.navigate().back();

		homepage.ClickDocsLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.docUrl);
		driver.navigate().back();
		
		homepage.ClicKOnaboutLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.aboutUrl);
		driver.navigate().back();
		
		homepage.ClicKOnblogLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.blogUrl);
		driver.navigate().back();
		
		homepage.ClicKOnpressLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.pressUrl);
		driver.navigate().back();
		
		homepage.ClicKOncontactUsLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.contactUsUrl);
		driver.navigate().back();
		
		homepage.ClicKOnNewsLink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.newsUrl);
		driver.navigate().back();
		
		homepage.ClickOnTRYFORFREElink();
		Assert.assertEquals(driver.getCurrentUrl(), urls.tryForFreeUrl);
		driver.navigate().back();
		
	}
	
	
	@Test(priority=2)
	public void VerifyFootersLinksDisplayedTest() {
		
		homepage = new Homepage(driver);
		
		Assert.assertTrue(homepage.IsDisplayedFooterFeatureLink());
		Assert.assertTrue(homepage.IsDisplayedFooterPricingLink());
		Assert.assertTrue(homepage.IsDisplayedFooterROICalculatorLink());
		Assert.assertTrue(homepage.IsDisplayedFooterResourceCenterLink());
		Assert.assertTrue(homepage.IsDisplayedFooterOverviewLink());
		Assert.assertTrue(homepage.IsDisplayedFooterDocsLink());
		Assert.assertTrue(homepage.IsDisplayedFooterPlatformsLink());
		Assert.assertTrue(homepage.IsDisplayedfooterFAQsLink());
		Assert.assertTrue(homepage.IsDisplayedFooteraboutLink());
		Assert.assertTrue(homepage.IsDisplayedFooterNewsLink());
		Assert.assertTrue(homepage.IsDisplayedFooterpressLink());
		Assert.assertTrue(homepage.IsDisplayedFooterblogLink());
		Assert.assertTrue(homepage.IsDisplayedFootercontactUsLink());
		Assert.assertTrue(homepage.IsDisplayedFooterBecomeAPartners());
		Assert.assertTrue(homepage.IsDisplayedFooterLinkedInLink());
		Assert.assertTrue(homepage.IsDisplayedFooterTwitterLink());
		Assert.assertTrue(homepage.IsDisplayedFooterFacebookLink());
		Assert.assertTrue(homepage.IsDisplayedfooterGitHubLink());
		Assert.assertTrue(homepage.IsDisplayedFooterPrivacyLink());
		Assert.assertTrue(homepage.IsDisplayedFooterTermsLink());
		Assert.assertTrue(homepage.IsDisplayedFooterSitempalink());
	}
}
