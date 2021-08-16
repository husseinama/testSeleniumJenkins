package base;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest{

    @Test
    public void testSuccessfullLogin()  {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginBtn();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
    }

    @Test
    public void testInsuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("test");
        loginPage.setPassword("Super");
        loginPage.clickLoginBtn();
        assertTrue(loginPage.getAlertText().contains("Your username is invalid!"),"Alert text is incorrect");
    }
}
