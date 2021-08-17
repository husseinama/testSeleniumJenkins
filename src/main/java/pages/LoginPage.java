package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage setUserName(String userName){
        By userNameField = By.id("username");
        driver.findElement(userNameField).sendKeys(userName);
        return this;
    }

    public LoginPage setPassword(String password){
        By passwordField = By.id("password");
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public String getAlertText(){
        By flashBanner = By.id("flash-messages");
        String alertText = driver.findElement(flashBanner).getText();
        return alertText;
    }

    public LoginPage clickLoginBtn(){
        By loginBtn = By.cssSelector("#login button");
        driver.findElement(loginBtn).click();
        return this;
    }
}
