package ContentStack.PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ContentStack.BaseMethods.BasePage;

public class Homepage extends BasePage{

	/*
	 * Locators Header
	 */
	
	@FindBy(css=".navbar-brand>img")
	private WebElement contentStackLogo;
	
	@FindBy(css=".dropdown-toggle[title='Product']")
	private WebElement productLink;
	
	@FindBy(linkText="Features")
	private WebElement featureLink;
	
	@FindBy(linkText="Technology")
	private WebElement technologyLink;
	
	@FindBy(linkText="Pricing")
	private WebElement pricingLink;
	
	@FindBy(css=".dropdown-toggle[title='Resources']")
	private WebElement resourcesLink;
	
	@FindBy(linkText="Resource center")
	private WebElement resourceCenterLink;

	@FindBy(linkText="ROI calculator")
	private WebElement ROICalculatorLink;	

	@FindBy(linkText="Docs")
	private WebElement docsLink;
	
	@FindBy(linkText="Partners")
	private WebElement partnersLink;
	
    @FindBy(css=".dropdown-toggle[title='Company']")
	private WebElement companyLink;
			
	@FindBy(linkText="About")
	private WebElement aboutLink;

	@FindBy(linkText="Blog")
	private WebElement blogLink;

	@FindBy(linkText="News")
	private WebElement newsLink;

	@FindBy(linkText="Press")
	private WebElement pressLink;

	@FindBy(linkText="Contact us")
	private WebElement contactUsLink;
	
	@FindBy(linkText="Log in")
	private WebElement logInLink;
	
	@FindBy(xpath="//li/a[@href='https://www.contentstack.com/company/contact-us?subject=free%20trial']")
	private WebElement TryForFreeLink;
	
	/*
	 * Locators - Footer
	 */
	@FindBy(xpath="//a[@href='/features']")
	private WebElement footerfeatureLink;
	
	@FindBy(linkText="Overview")
	private WebElement footerOverviewLink;
	
	@FindBy(linkText="Pricing")
	private WebElement footerpricingLink;
	
	@FindBy(linkText="Resource center")
	private WebElement footerresourceCenterLink;

	@FindBy(linkText="ROI calculator")
	private WebElement footerROICalculatorLink;	

	@FindBy(linkText="Docs")
	private WebElement footerdocsLink;
	
	@FindBy(linkText="Platforms")
	private WebElement footerPlatformsLink;

	@FindBy(linkText="Partners")
	private WebElement footerPartnersLink;
			
	@FindBy(linkText="About us")
	private WebElement footeraboutLink;

	@FindBy(linkText="Blog")
	private WebElement footerblogLink;

	@FindBy(linkText="News")
	private WebElement footernewsLink;

	@FindBy(linkText="Press")
	private WebElement footerpressLink;

	@FindBy(linkText="Contact us")
	private WebElement footercontactUsLink;
	
	@FindBy(linkText="LinkedIn")
	private WebElement footerlikedInLink;

	@FindBy(linkText="Facebook")
	private WebElement footerFacebookLink;
	
	@FindBy(linkText="Github")
	private WebElement footerGithubLink;
	
	@FindBy(linkText="Twitter")
	private WebElement footerTwitterLink;
	
	@FindBy(linkText="Privacy")
	private WebElement footerPrivacyLink;
	
	@FindBy(linkText="Terms")
	private WebElement footerTermsLink;
	
	@FindBy(linkText="Sitemap")
	private WebElement footerSiteMapLink;	
	
	@FindBy(linkText="FAQs")
	private WebElement footerFAQsLink;
	
	
	/*
	 * Constructor
	 */
	
	public Homepage (WebDriver driver) {
		super(driver);
	}
	
   /*
    * Header Methods
    */
	
	public void ClickOnContentStackLogo() {
		contentStackLogo.click();
	}
	
	public void ClickOnFeatureLink() {
		productLink.click();
		featureLink.click();
	}
	
	public void ClickOnTechnologyLink() {
		productLink.click();
		technologyLink.click();
	}
	
	public void ClickOnPricingLink() {
		productLink.click();
		pricingLink.click();
	}
	
	public void ClickOnResourceCenterLink() {
		resourcesLink.click();
		resourceCenterLink.click();
	}
	
	public void ClickOnROICalculatorLink() {
		resourcesLink.click();
		ROICalculatorLink.click();
	}
	
	public void ClickDocsLink() {
		resourcesLink.click();
		docsLink.click();
	}
	
	public void ClickOnPartners() {
		partnersLink.click();
	}
	
	public void ClicKOnaboutLink() {
		companyLink.click();
		aboutLink.click();
	}
	
	public void ClicKOnblogLink() {
		companyLink.click();
		blogLink.click();
	}
	
	public void ClicKOnNewsLink() {
		companyLink.click();
		newsLink.click();
	}
	
	public void ClicKOnpressLink() {
		companyLink.click();
		pressLink.click();
	}
	
	public void ClicKOncontactUsLink() {
		companyLink.click();
		contactUsLink.click();
	}
	
	public void ClickOnLogIn() {
		logInLink.click();
	}
	
	public void ClickOnTRYFORFREElink() {
		TryForFreeLink.click();
	}
	
	/*
	 * Footer Methods
	 */
	public boolean IsDisplayedFooterFeatureLink() {
		return footerfeatureLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterOverviewLink() {
		return footerOverviewLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterPricingLink() {
		return footerpricingLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterResourceCenterLink() {
		return footerresourceCenterLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterROICalculatorLink() {
		return footerROICalculatorLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterDocsLink() {
		return footerdocsLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterPlatformsLink() {
		return footerPlatformsLink.isDisplayed();
	}
	
	public boolean IsDisplayedfooterFAQsLink() {
		return footerFAQsLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooteraboutLink() {
		return footeraboutLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterblogLink() {
		return footerblogLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterNewsLink() {
		return footernewsLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterpressLink() {
		return footerpressLink.isDisplayed();
	}
	
	public boolean IsDisplayedFootercontactUsLink() {
		return footercontactUsLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterBecomeAPartners() {
		return footerPartnersLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterTwitterLink() {
		return footerTwitterLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterFacebookLink() {
		return footerFacebookLink.isDisplayed();
	}
	
	public boolean IsDisplayedfooterGitHubLink() {
		return footerGithubLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterLinkedInLink() {
		return footerlikedInLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterPrivacyLink() {
		return footerPrivacyLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterTermsLink() {
		return footerTermsLink.isDisplayed();
	}
	
	public boolean IsDisplayedFooterSitempalink() {
		return footerSiteMapLink.isDisplayed();
	}

}
