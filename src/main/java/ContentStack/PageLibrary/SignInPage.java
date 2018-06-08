package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class SignInPage extends BasePage {
	
	@FindBy(id="email")
	private WebElement emailTextBox;
	
	@FindBy(id="pw")
	private WebElement passwordTextbox;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//span[@class='invalid']")
	private WebElement validationMessage;

	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	
	public String  CheckValidation() {
	    loginbutton.click();
		return validationMessage.getText().trim();
		
	}

}
