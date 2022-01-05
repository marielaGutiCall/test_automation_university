package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    /* Notes:
    * Page Object Model Design Pattern
    * It's custom in the page object model design pattern that if your action
    * changes the page then you should return a handle to that new page*/
    //private By formAuthenticationLink = By.linkText("Form Authentication");

    private WebDriver _driver;
    public HomePage(WebDriver driver){
        this._driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(_driver);
    }
    public DropdownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(_driver);
    }
    private void clickLink(String link){
        _driver.findElement(By.linkText(link)).click();
    }
}
