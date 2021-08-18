package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String userName){
        WebElement userNameField = driver.findElement(By.id("username"));
        sendKeys(userNameField,userName);
    }

    public void setPassword(String password){
        WebElement passwordField = driver.findElement(By.id("password"));
        sendKeys(passwordField,password);
    }

    public String getAlertText(){
        String alertText = driver.findElement(By.id("flash-messages")).getText();
        return alertText;
    }

//    public void clickLoginBtn(){
//        WebElement loginBtn = driver.findElement(By.cssSelector("#login button"));
//        click(loginBtn);
//    }
}
