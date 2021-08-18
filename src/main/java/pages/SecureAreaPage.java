package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends PageBase{

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getAlertText(){
        String statusAlertText = driver.findElement(By.id("flash")).getText();
        return statusAlertText;
    }
}
