// this class provides common methods to interact with web elements 

package LinkedInLogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
//
//    public void type(WebElement element, String text) {
//        wait.until(ExpectedConditions.visibilityOf(element));
//        element.clear();
//        element.sendKeys(text);
//    }
//
//    public String getText(WebElement element) {
//        wait.until(ExpectedConditions.visibilityOf(element));
//        return element.getText();
//    }
//
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
//
//
//    public void waitForElementToBeClickable(WebElement element) {
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//    public void navigateTo(String url) {
//        driver.get(url);
//    }
}
