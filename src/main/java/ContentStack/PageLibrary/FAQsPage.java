package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class FAQsPage extends BasePage {
	
	/*
	 * Locators
	 */

	@FindBy(linkText="General")
	private WebElement genrallink;
	
	@FindBy(linkText="Security")
	private WebElement securitylink;
	
	@FindBy(linkText="Technology")
	private WebElement technologylink;
	
	@FindBy(css=".navbar-brand>img")
	private WebElement brandlogolink;

	
	/*
	 * Constructor
	 */
	public FAQsPage(WebDriver driver) {
		super(driver);		
	}
	
	
	/*
	 * Methods
	 */
	public void clickOnGenralLink() {
		genrallink.click();
	}
	
	public void clickOnSecurityLink() {
		securitylink.click();
	}
	
	public void clickOnTechnologyLink() {
		technologylink.click();
	}
	
	public boolean IsActiveGenral() {
		return genrallink.isEnabled();
	}
	
	public boolean IsActiveSecurityLink() {
		return securitylink.isEnabled();
	}
	
	public boolean IsActiveTechnologyLink() {
		return technologylink.isEnabled();
	}
	
	public void ClickOnContentStackLogo() {
		brandlogolink.click();
	}

}
