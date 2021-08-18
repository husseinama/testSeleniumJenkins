package base;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest{
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    SecureAreaPage secureAreaPage = new SecureAreaPage(driver);

    @Test
    public void testSuccessfullLogin()  {
        homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        //loginPage.clickLoginBtn();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
    }

    @Test
    public void testInsuccessfullLogin() {
        homePage.clickFormAuthentication();
        loginPage.setUserName("test");
        loginPage.setPassword("Super");
       // loginPage.clickLoginBtn();
        assertTrue(loginPage.getAlertText().contains("Your username is invalid!"),"Alert text is incorrect");
    }
}
