package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.PageLibrary.Homepage;
import ContentStack.PageLibrary.PricingPage;

public class PricingPageTest extends BaseTest  {
	
	PricingPage pricingpage;
	
	@Test
	public void verifyPricingSectionsTest() {
		pricingpage = new PricingPage(driver);
		Homepage homepage = new Homepage(driver);
		
		homepage.ClickOnPricingLink();
		Assert.assertEquals(pricingpage.GetTrialText(), "Trial");
		Assert.assertEquals(pricingpage.GetBuisnessText(), "Business");
		Assert.assertEquals(pricingpage.GetEnterpriseText(), "Enterprise");
	}

}
