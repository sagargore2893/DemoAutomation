package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class ROICalculatorPage extends BasePage{
	
	/*
	 * Locators
	 */
	
	@FindBy(xpath="//div/label[@for='check00']/div/i")
	private WebElement seoOption;

	@FindBy(xpath="//div/label[@for='check31']/div/i")
	private WebElement blogOption;
	
	
	/*
	 * Constructor
	 */
	public ROICalculatorPage(WebDriver driver) {
		super(driver);		
	}
	
	/*
	 * Methods
	 */
	
	public void IsDisplayedSEO() {
		seoOption.isDisplayed();
	}
	
	public void IsDisplayedBlog() {
		blogOption.isDisplayed();
	}

}
