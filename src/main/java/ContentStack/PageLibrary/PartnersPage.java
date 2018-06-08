package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class PartnersPage extends BasePage {
	/*
	 * Locators
	 */
	@FindBy(xpath="//div/h3[text()='Solutions Partners']")
	private WebElement solutionPartners;
	
	@FindBy(xpath="//div/h3[text()='Technology Partners']")
	private WebElement technologyPartners;	
	
	

	/*
	 * Constructor
	 */
	public PartnersPage(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Methods
	 */
	
	public String GetSolutionPartnersText() {
		return solutionPartners.getText();
	}
	
	public String GetTechnologyPartnersText() {
		return technologyPartners.getText();
	}

	
}
