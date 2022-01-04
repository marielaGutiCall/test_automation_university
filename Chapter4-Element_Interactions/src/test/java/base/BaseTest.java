package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTest {
    private WebDriver _driver;
    protected HomePage homePage;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        _driver = new ChromeDriver();
        _driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(_driver);
        _driver.quit();
    }
    public static void main(String args[]){
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}
