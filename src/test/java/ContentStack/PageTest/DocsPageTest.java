package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.Constants.URLs;
import ContentStack.PageLibrary.DocsPage;

public class DocsPageTest extends BaseTest{
	
	DocsPage docspage;
	
	@Test
	public void verifyOverviewLinkTest() {
		docspage = new DocsPage(driver);
		URLs urls = new URLs();
		
		driver.get(urls.docUrl);
		docspage.ClickOnOverview();
		String heading = "What is Contentstack";
		String heading2 = "How it works";
		Assert.assertTrue(driver.getPageSource().contains(heading));
		Assert.assertTrue(driver.getPageSource().contains(heading2));
		
	}

}
