package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By userNameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginBtn = By.cssSelector("#login button");
    private final By flashBanner = By.id("flash-messages");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public String getAlertText(){
        return driver.findElement(flashBanner).getText();
    }

    public SecureAreaPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }
}
