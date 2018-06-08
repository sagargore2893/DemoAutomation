package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.Constants.URLs;
import ContentStack.PageLibrary.ROICalculatorPage;

public class ROICalculatorPageTest extends BaseTest{
	ROICalculatorPage roicalculatorpage;
	
	@Test
	public void verifyUserCanSelectCheckboxTest() {
		roicalculatorpage = new ROICalculatorPage(driver);
		URLs urls = new URLs();
		
		driver.get(urls.roiCalculatorUrl);
		roicalculatorpage.IsDisplayedSEO();
		Assert.assertTrue(driver.getPageSource().contains("SEO"));
		roicalculatorpage.IsDisplayedBlog();
		Assert.assertTrue(driver.getPageSource().contains("Blog"));
		
		
	}

}
