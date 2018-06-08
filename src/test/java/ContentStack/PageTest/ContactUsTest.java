package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.PageLibrary.ContactUsPage;
import ContentStack.PageLibrary.Homepage;

public class ContactUsTest extends BaseTest{

	ContactUsPage contactUsPage;
	@Test
	public void FillTryForFreeFormTest() {
		contactUsPage = new ContactUsPage(driver);
		Homepage homepage = new Homepage(driver);
		homepage.ClickOnTRYFORFREElink();
		
		contactUsPage.EnterDetails("Test", "Test", "test@mailinator.com", "ABC", "ABC");
		Assert.assertTrue(contactUsPage.IsDisplayedButton());
	}
	
}
