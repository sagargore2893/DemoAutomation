package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class PricingPage extends BasePage {
	
	/*
	 * Locators
	 */
	
	@FindBy(xpath="//div/h3[text()='Trial']")
	private WebElement trialText;

	@FindBy(xpath="//div/h3[text()='Business']")
	private WebElement BuisnessText;

	@FindBy(xpath="//div/h3[text()='Enterprise']")
	private WebElement EnterpriseText;

	
	/*
	 * Constructors
	 */
	public PricingPage(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Methods
	 */
	
	public String GetTrialText() {
		return trialText.getText();
	}
	
	public String GetBuisnessText() {
		return BuisnessText.getText();
	}

	public String GetEnterpriseText() {
		return EnterpriseText.getText();
	}
}
