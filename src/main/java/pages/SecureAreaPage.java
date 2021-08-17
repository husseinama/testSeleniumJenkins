package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        By statusAlert = By.id("flash");
        String alertText = driver.findElement(statusAlert).getText();
        return alertText;
    }
}
