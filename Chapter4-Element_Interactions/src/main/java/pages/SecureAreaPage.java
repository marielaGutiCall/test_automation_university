package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver _driver;
    private By statusAlert = By.id("flash");
    public SecureAreaPage(WebDriver driver){
        this._driver = driver;
    }
    public String getAlertText(){
        return _driver.findElement(statusAlert).getText();
    }
}
