package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import ContentStack.BaseMethods.BasePage;

public class ContactUsPage extends BasePage {

	/*
	 * Locators
	 */
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Company")
	private WebElement companyname;
	
	@FindBy(id="Title")
	private WebElement jobtitle;
	
	@FindBy(id="Industry")
	private WebElement buisnesstype;
	
	@FindBy(className="mktoButton")
	private WebElement getstarted;
	
	@FindBy(css=".action-link>a")
	private WebElement backToHomepage;
	/*
	 * Constructor
	 */
	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Methods
	 */
	
	public void EnterDetails(String firstName,String lastName,String emailId,String companyName,String jobTitle) {
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
		email.sendKeys(emailId);
		companyname.sendKeys(companyName);
		jobtitle.sendKeys(jobTitle);
		Select dropdown = new Select(buisnesstype);
		dropdown.selectByIndex(2);
		getstarted.click();
	}
	
	public boolean IsDisplayedButton() {
		return backToHomepage.isDisplayed();
	}

}
