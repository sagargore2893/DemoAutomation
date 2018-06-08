package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class TechnologyPage extends BasePage{

	/*
	 * Locators
	 */
	
	@FindBy(css=".tab-sub-nav>li>a[title='Docs']")
	private WebElement docsLink;
	
	
	
	/*
	 * constructor
	 */
	public TechnologyPage(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Methods
	 */

	public void ClickOnDocsfromSubMenu() {
		docsLink.click();
	}
	
}
