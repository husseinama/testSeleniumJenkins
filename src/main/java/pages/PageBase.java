package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    WebDriver driver;
    public static final long WAIT = 10;

     public PageBase(WebDriver driver){
         this.driver = driver;
         PageFactory.initElements(driver, this);
     }
     public void waitForVisibility(WebElement element){
         WebDriverWait wait = new WebDriverWait(driver,WAIT);
         wait.until(ExpectedConditions.visibilityOf(element));
     }

//     public void click(WebElement element){
//         element.click();
//     }
//
    public void sendKeys(WebElement element, String text){
        element.sendKeys(text);
    }
}
