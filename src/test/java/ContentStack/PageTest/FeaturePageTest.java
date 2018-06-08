package ContentStack.PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ContentStack.BaseMethods.BaseTest;
import ContentStack.PageLibrary.FeaturePage;
import ContentStack.PageLibrary.Homepage;

public class FeaturePageTest extends BaseTest {

	FeaturePage featurepage;
	
	@Test
	public void VerifyFeaturesLinksTest() {
		
		featurepage = new FeaturePage(driver);
		Homepage homepage = new Homepage(driver);
		
		homepage.ClickOnFeatureLink();
		
		featurepage.clickOnCollaboration();
		Assert.assertTrue(featurepage.IsActiveCollaboration());
		
		featurepage.clickOnOptimization();
		Assert.assertTrue(featurepage.IsActiveOptimization());
		
		featurepage.clickOnEnterpriseGrade();
		Assert.assertTrue(featurepage.IsActiveEnterpriseGrade());
		
		featurepage.clickOnIntegration();
		Assert.assertTrue(featurepage.IsActiveIntegration());
		
		featurepage.clickOnDeveloper();
		Assert.assertTrue(featurepage.IsActiveDeveloper());
		
		featurepage.clickOnOmnichannel();
		Assert.assertTrue(featurepage.IsActiveOmnichannel());
		
		featurepage.clickOnMoreFeatures();
		Assert.assertTrue(featurepage.IsActiveMoreFeatures());
	}
}
