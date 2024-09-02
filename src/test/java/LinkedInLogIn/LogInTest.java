package LinkedInLogIn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void verifyUserCanLogInWithValidCredentials() {
        driver.get("https://www.linkedin.com/login");
        
        LinkedInLoginPage loginPage = new LinkedInLoginPage(driver);
        
        loginPage.login("israajdali9@gmail.com", "1492002i");
        
        Assert.assertTrue(loginPage.isProfileIconVisible(), "Login failed, profile icon is not displayed.");
    }
}
