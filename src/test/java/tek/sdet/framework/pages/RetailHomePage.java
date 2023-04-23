package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
    
    public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }
    
    @FindBy(linkText = "Sign in")
	public WebElement signInButton;
    
    @FindBy(xpath = "//a[text()='Account']")
	public WebElement accountOption;
    
    @FindBy(id = "hamburgerBtn")
    public WebElement allIcon;
    
    @FindBy(xpath ="//div[@class= 'sidebar_content-item']/span")
    public List<WebElement> sideBarElements;
}
