package ContentStack.BaseMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

    
public class BasePage {
	
	public BrowserActions actions;
	protected  BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		actions = new BrowserActions(driver);
	}
}
