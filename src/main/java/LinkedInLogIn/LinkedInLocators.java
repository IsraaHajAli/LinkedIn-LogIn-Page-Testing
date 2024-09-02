// this class provides locators identification 
package LinkedInLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedInLocators {
	
	
	// email field
    @FindBy(id = "username")
    public static WebElement userNameField;
    
    // password field
    @FindBy(id = "password")
    public static WebElement passwordField;

    // sign in button
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement signInButton;

    // forgot button
    @FindBy(linkText="Forgot password?")
    public static WebElement forgotButton;
    
    // toggle button
    @FindBy(id="password-visibility-toggle")
    public static WebElement toggleButton;
    
    // google button
    @FindBy(className="nsm7Bb-HzV7m-LgbsSe-BPrWId")
    public static WebElement googleButton;
    
    // apple button
    @FindBy(className="sign-in-with-apple-button__text")
    public static WebElement appleButton;
    
    // profileIcon
    @FindBy(id="ember27")
    public static WebElement profileIcon;
    
}
