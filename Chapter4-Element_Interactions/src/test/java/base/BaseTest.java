package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;


public class BaseTest {
    private WebDriver _driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        _driver = new ChromeDriver();
        _driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(_driver);

    }
    @AfterClass
    public void tearDown(){
        _driver.quit();
    }
}
