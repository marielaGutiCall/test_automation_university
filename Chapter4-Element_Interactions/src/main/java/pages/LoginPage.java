package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver _driver;
    private By _userField = By.id("username");
    private By _password = By.id("password");
    private By _buttonLogin = By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this._driver = driver;
    }
    public void setUserName(String username){
        _driver.findElement(_userField).sendKeys(username);
    }
    public void setPassword(String password){
        _driver.findElement(_password).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        _driver.findElement(_buttonLogin).click();
        return new SecureAreaPage(_driver);
    }

}
