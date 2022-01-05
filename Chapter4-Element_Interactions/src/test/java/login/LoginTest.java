package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/*Methods available on web element
For a radio button, if you want to select one of these, you just find the radio button and you do a .click on it.
For checkboxes, same thing. If you want to select it, you just click.*/
public class LoginTest extends BaseTest {

    @Test
   public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        //assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area! x", "Alert text is incorrect");
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text is incorrect");
    }
}
