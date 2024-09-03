// this class provides methods to perform actions on the locators in the login page
package LinkedInLogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LinkedInLoginPage extends BasePage {

    public LinkedInLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, LinkedInLocators.class); 
    }

    public void enterUsername(String username) {
        LinkedInLocators.userNameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        LinkedInLocators.passwordField.sendKeys(password);
    }
    
    public void clickSignIn() {
    	WebElement signInBtn = LinkedInLocators.signInButton;

        //WebElement signInBtn = driver.findElement(LinkedInLocators.signInButton);
        click(signInBtn);
    }

    public boolean isProfileIconVisible() {
    	WebElement profileIcon = LinkedInLocators.profileIcon;
    	
        //WebElement profileIcon = driver.findElement(LinkedInLocators.profileIcon);
        return profileIcon.isDisplayed();
    }
    
    public boolean isErrorMessageVisible() {
    	WebElement errorMessage = LinkedInLocators.errorMessage;
    	return errorMessage.isDisplayed();
    	}
    public boolean isForgotButtonVisible() {
    	WebElement forgotButton = LinkedInLocators.forgotButton;
    	waitForVisibility(forgotButton);
    	return forgotButton.isDisplayed();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickSignIn();
    }
}
