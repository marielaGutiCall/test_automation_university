package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver _driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        _driver = new ChromeDriver();
        _driver.get("https://the-internet.herokuapp.com/");
        System.out.println(_driver.getTitle());

        // 1. Maximize the window
        //_driver.manage().window().maximize();

        // 2. Fullscreend Mode
        //_driver.manage().window().fullscreen();

        // 3. Specific width and height (Show Crome iPhoneX emulator)
        //Dimension dimension = new Dimension(375, 812);
        //_driver.manage().window().setSize(dimension);



        // Finding Web Elements, multiples Elements with findElements use data type List
        List<WebElement> inputLinks = _driver.findElements(By.tagName("a"));
        System.out.println(inputLinks.size());

        // Finding Web Element, one Element with findElement
        //WebElement inputLink = _driver.findElement(By.linkText("Inputs"));
        //inputLink.click();

        /*Optional Independent Exercise*/
        WebElement scLink = _driver.findElement(By.linkText("Shifting Content"));
        scLink.click();
        List<WebElement> fmeLink = _driver.findElements(By.tagName("a"));
        System.out.println(fmeLink.get(1).getText());
        fmeLink.get(1).click();
        List<WebElement> linksMenu = _driver.findElements(By.tagName("li"));
        System.out.println(linksMenu.size());
        for(WebElement itemMenu: linksMenu){
            System.out.println("Item " + itemMenu.getText());
        }

        _driver.quit();

    }
    public static void main(String args[]){
        BaseTests unitTest = new BaseTests();
        unitTest.setUp();
    }
}
/*
* Notes:
* When chromedriver don't execute, it could solve with the command
1. Open terminal
2. Navigate to path where your chromedriver file is located
3. Execute
Commnad # 1: xattr -d com.apple.quarantine <name-of-executable>
* */