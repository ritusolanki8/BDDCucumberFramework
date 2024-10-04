package com.ui.pages;

import com.ui.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.actions.UIUtils;

public class IFrameExamplePage extends BaseClass{
    public IFrameExamplePage(WebDriver driver)
    {
        BaseClass.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public UIUtils utils = new UIUtils(driver);

    @FindBy(css = "iFrame[id='aswift_0']")
    public WebElement clickOniFrame;

    @FindBy(xpath = "//a[text()='Iframe with in an Iframe']")
    public WebElement withInIFrameTab;

    @FindBy(id = "singleframe")
    public WebElement firstIFrame;

    //@FindBy(css = "div[id='Multiple'] iframe[src='MultipleFrames.html']")
    @FindBy(css = "div[id='Multiple']>iframe")
    public WebElement secondIFrame;

    @FindBy(css = "div[class='container iframes-page-container']")
    public WebElement nestedFrame;

    @FindBy(xpath = "//iframe[@src='MultipleFrames.html']")
    public WebElement multipleFrame1;

    @FindBy(css = "div[class='iframe-container']>iframe")
    public WebElement iFrameDemo;

    @FindBy(css = "div[class='col-xs-6 col-xs-offset-5'] input[type='text']")
    public WebElement input;

  /*  public void iFrameTest() throws InterruptedException {
        utils.scrollPageToElement(clickOniFrame);
        utils.actionsOniFrame(clickOniFrame);
    }*/

    public void withInAnIframe() throws InterruptedException {
        Thread.sleep(3000);
        utils.mouseHoverAction(withInIFrameTab);
        utils.click(withInIFrameTab);


       /* utils.actionsOniFrame(firstIFrame);
        utils.actionsOniFrame(secondIFrame);*/
        utils.actionsOniFrame(multipleFrame1);
        utils.actionsOniFrame(iFrameDemo);
        utils.setValue(input, "sdfghjk");
    }


}

