package com.ui.pages;

import com.ui.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.actions.UIUtils;
import utils.helpers.FileUtil;

import java.util.Set;

public class LoginPage extends BaseClass {
    public LoginPage(WebDriver driver)
    {
        BaseClass.driver = driver;
        PageFactory.initElements(driver,this);
    }

public UIUtils utils = new UIUtils(driver);

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="enterimg")
    public WebElement loginButton;

    @FindBy(xpath = "//section[@id='section']//div//h2")
    public WebElement homePageTitle;

    public void loginToPage() throws InterruptedException{
          utils.setValue(email, "ghjkcvbnm");
          Thread.sleep(3000);
          utils.click(loginButton);
    }

    public void verifyPageHeaders(){
        String expectedUrl = "https://demo.automationtesting.in/Register.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl, "The url is not matched");
        String title = homePageTitle.getText();
        Assert.assertEquals("Register", title, "Not navigated to the register page");
        utils.navigateToBack();
        System.out.println("Git Test");

    }
}
