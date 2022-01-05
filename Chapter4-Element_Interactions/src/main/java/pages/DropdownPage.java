package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver _driver;
    private By _dropdown  = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this._driver = driver;
    }
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        //List<String> options = new ArrayList<String>();
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        /* for(WebElement option:selectedElements){
             options.add(option.getText());
         }*/
         return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropDownElement(){
        return new Select(_driver.findElement(_dropdown));
    }
}
