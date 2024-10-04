package com.ui.pages;

import com.ui.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.actions.UIUtils;

public class RegistrationPage extends BaseClass{
    public RegistrationPage(WebDriver driver)
    {
        BaseClass.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public UIUtils utils = new UIUtils(driver);

    @FindBy(css = "select[id='Skills']")
    public WebElement skillsDropDown;

    @FindBy(css = "select[id='Skills'] option[value='Android']")
    public WebElement selectedValue;

    public void dropdownValue() throws InterruptedException{
        utils.selectByVisibleText(skillsDropDown, "Android");
    }

    public void verifySelectedDropDownValue() throws InterruptedException{
        String expectedSelectedValue = "Android";
        utils.waitForElementForSeconds(selectedValue, 2000);
        String actualValue = utils.getSelectedOption(selectedValue);
        System.out.println(actualValue);
        Assert.assertEquals(expectedSelectedValue,actualValue, "Value is not same");
    }

}

