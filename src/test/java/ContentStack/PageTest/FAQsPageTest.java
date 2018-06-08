package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.Constants.URLs;
import ContentStack.PageLibrary.FAQsPage;

public class FAQsPageTest extends BaseTest {

	FAQsPage faqspage;
	
	@Test
	public void VerifyFAQsLinkTest() {
		faqspage = new FAQsPage(driver);
		URLs urls = new URLs();
		
		driver.get(urls.faqsUrl);
		faqspage.clickOnGenralLink();
		Assert.assertTrue(faqspage.IsActiveGenral());
		
		faqspage.clickOnSecurityLink();
		Assert.assertTrue(faqspage.IsActiveSecurityLink());
		
		faqspage.clickOnTechnologyLink();
		Assert.assertTrue(faqspage.IsActiveTechnologyLink());
	}
	
	@Test
	public void VerifyBrandLogoTest() {
		faqspage = new FAQsPage(driver);
		URLs urls = new URLs();
		
		driver.get(urls.faqsUrl);
		faqspage.ClickOnContentStackLogo();
		Assert.assertEquals(driver.getCurrentUrl(), urls.homepageUrl);
	}
}
