package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    /* Notes:
    * Page Object Model Design Pattern
    * It's custom in the page object model design pattern that if your action
    * changes the page then you should return a handle to that new page*/
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private WebDriver _driver;
    public HomePage(WebDriver driver){
        this._driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        _driver.findElement(formAuthenticationLink).click();
        return new LoginPage(_driver);
    }
}
