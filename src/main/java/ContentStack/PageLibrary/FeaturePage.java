package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class FeaturePage extends BasePage {

	/*
	 * Locators
	 */
	
	@FindBy(linkText="Collaboration")
	private WebElement collaborationlink;
	
	@FindBy(linkText="Optimization")
	private WebElement optimizationlink;
	
	@FindBy(linkText="Enterprise Grade")
	private WebElement enterpriseGradelink;
	
	@FindBy(linkText="Integration")
	private WebElement integrationlink;
	
	@FindBy(linkText="Omnichannel")
	private WebElement omnichannellink;
	
	@FindBy(linkText="Developer")
	private WebElement developerlink;

	@FindBy(linkText="More Features")
	private WebElement moreFeatureslink;
	
	/*
	 * Constructor
	 */
	public FeaturePage(WebDriver driver) {
		super(driver);		
	}

	/*
	 * Methods
	 */
	public void clickOnCollaboration() {
		collaborationlink.click();
	}
	
	public void clickOnOptimization() {
		optimizationlink.click();
	}
	
	public void clickOnEnterpriseGrade() {
		enterpriseGradelink.click();
	}
	
	public void clickOnIntegration() {
		integrationlink.click();
	}
	
	public void clickOnOmnichannel() {
		omnichannellink.click();
	}
	
	public void clickOnDeveloper() {
		developerlink.click();
	}
	
	public void clickOnMoreFeatures() {
		moreFeatureslink.click();
	}
	
	public boolean IsActiveCollaboration() {
		return collaborationlink.isEnabled();
	}
	
	public boolean IsActiveOptimization() {
		return optimizationlink.isEnabled();
	}
	
	public boolean IsActiveEnterpriseGrade() {
		return enterpriseGradelink.isEnabled();
	}
	
	public boolean IsActiveIntegration() {
		return integrationlink.isEnabled();
	}
	
	public boolean IsActiveOmnichannel() {
		return omnichannellink.isEnabled();
	}
	
	public boolean IsActiveDeveloper() {
		return developerlink.isEnabled();
	}
	
	public boolean IsActiveMoreFeatures() {
		return moreFeatureslink.isEnabled();
	}
	
}
