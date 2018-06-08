package ContentStack.PageTest;

import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.Constants.URLs;
import ContentStack.PageLibrary.SignInPage;

public class SignInPageTest extends BaseTest{

	SignInPage signInpage;
	
	@Test
	public void validationTest() {
		
		signInpage = new SignInPage(driver);
		URLs urls = new URLs();
	
		driver.get(urls.signInUrl);
		signInpage.CheckValidation();
	}
	
}
