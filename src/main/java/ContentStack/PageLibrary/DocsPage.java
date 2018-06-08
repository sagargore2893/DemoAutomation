package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class DocsPage extends BasePage{

	/*
	 * Locators
	 */
	
	@FindBy(linkText="Overview")
	private WebElement overviewLink;
	
	
	/*
	 * Constructor
	 */
	public DocsPage(WebDriver driver) {
		super(driver);
	}
	
	
	/*
	 * Methods
	 */
	
	public void ClickOnOverview() {
		overviewLink.click();
	}

}
