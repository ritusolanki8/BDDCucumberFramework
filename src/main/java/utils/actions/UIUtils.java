package utils.actions;

import com.ui.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class UIUtils extends BaseClass {

    public UIUtils(WebDriver driver) {
        BaseClass.driver= driver;
    }

    final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    public void click(WebElement element){
        waitForElementTobeClickable(element);
        System.out.println(element+" clicked successfully");
    }

    public void waitForElementTobeClickable(WebElement element)
    {
        FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
        wait.until(driver1 -> element.isDisplayed());
        wait.until(driver1 -> element.isEnabled());
        element.click();
    }

    public void setValue(WebElement element, String value)
    {
        waitForElementForSeconds(element,80);
        element.sendKeys(value);
        System.out.println("Values are entered as " +value+"  successfully");
    }

    public  void waitForElementForSeconds(WebElement element, int timeout){
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        wait1.until(ExpectedConditions.visibilityOf(element));
    }

    public void selectByVisibleText(WebElement element, String value) {
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText(value);
    }

    public String getSelectedOption(WebElement element) {
        return element.getText();
        //Select select = new Select(element);
        //return select.getFirstSelectedOption().getText();
    }

    public void navigateToBack(){
        driver.navigate().back();
    }

    public WebDriver actionsOniFrame(WebElement element){
        return driver.switchTo().frame(element);
    }

    public void scrollPageToElement(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void mouseHoverAction(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }

}