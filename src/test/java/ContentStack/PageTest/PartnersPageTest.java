package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.PageLibrary.Homepage;
import ContentStack.PageLibrary.PartnersPage;

public class PartnersPageTest extends BaseTest{

	PartnersPage partnerspage;
	
	@Test
	public void VerifyPartnersSectionsTest() {
		partnerspage = new PartnersPage(driver);
		Homepage homepage = new Homepage(driver);
		
		homepage.ClickOnPartners();
		Assert.assertEquals(partnerspage.GetSolutionPartnersText(),"Solutions Partners");
		Assert.assertEquals(partnerspage.GetTechnologyPartnersText(),"Technology Partners");
	}
	
	@Test
	public void VerifyContentUnderSolutionPartnerSectionTest() {
		partnerspage = new PartnersPage(driver);
		Homepage homepage = new Homepage(driver);
		
		String solution = "The Contentstack partner program provides commercial benefits, exclusive technical support and opportunities to collaborate around sales and marketing initiatives.";
		homepage.ClickOnPartners();
		Assert.assertTrue(driver.getPageSource().contains(solution));
	}
	
	@Test
	public void VerifyContentUnderTechnologyPartnerSectionTest() {
		partnerspage = new PartnersPage(driver);
		Homepage homepage = new Homepage(driver);
		
		String technology = "There are many technologies that can complement or benefit from a headless CMS. We’d love to learn about yours."; 
		homepage.ClickOnPartners();
		Assert.assertTrue(driver.getPageSource().contains(technology));
	}
}
