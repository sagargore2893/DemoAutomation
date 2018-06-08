package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.PageLibrary.Homepage;
import ContentStack.PageLibrary.TechnologyPage;

public class TechnologyPageTest extends BaseTest {

	TechnologyPage technologyPage;
	
	@Test
	public void ChooseAndroidLanguageTest() {

		technologyPage = new TechnologyPage(driver);
		Homepage homepage = new Homepage(driver);
		homepage.ClickOnTechnologyLink();
		
		technologyPage.ClickOnDocsfromSubMenu();;
		Assert.assertTrue(driver.getPageSource().contains("docLink"));
	}
}
