package LinkedInLogIn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
	
	String linkedInURL = "https://www.linkedin.com/login";

    @Test
    public void verify_User_Can_LogIn_With_Valid_EmailandPassword() {
        driver.get(linkedInURL);
        
        LinkedInLoginPage loginPage = new LinkedInLoginPage(driver);
        
        loginPage.login("israajdali9@gmail.com", "1492002i");
        
        Assert.assertTrue(loginPage.isProfileIconVisible(), "Login failed, profile icon is not displayed.");
    }
    
    @Test
    public void verify_User_Can_LogIn_With_Valid_Email_InvalidPassword() {
        driver.get(linkedInURL);
        
        LinkedInLoginPage loginPage = new LinkedInLoginPage(driver);
        
        loginPage.login("israajdali9@gmail.com", "1492002");
        
        Assert.assertTrue(loginPage.isErrorMessageVisible(), "Login looks successful, error message is not displayed.");
    }
    
    @Test
    public void pageTitle() {
       

        String expectedTitle = "LinkedIn Login, Sign in | LinkedIn";
        
        driver.get(linkedInURL);

        String actualTitle = driver.getTitle();
        
        Assert.assertEquals(actualTitle, expectedTitle, "Page title is not as expected.");
        
    }
    
    @Test
    public void verifyForgotPasswordVisible() {
    	driver.get(linkedInURL);
        LinkedInLoginPage loginPage = new LinkedInLoginPage(driver);
        loginPage.isForgotButtonVisible();

    }
    
    
    
    
}
