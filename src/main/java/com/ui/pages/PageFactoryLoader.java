package com.ui.pages;


import org.openqa.selenium.WebDriver;

public class PageFactoryLoader{

    public static LoginPage loginPage;
    public static RegistrationPage registrationPage;
    public static IFrameExamplePage iframe;


    public void loadPageFactory(WebDriver driver){
       loginPage = new LoginPage(driver);
       registrationPage = new RegistrationPage(driver);
       iframe = new IFrameExamplePage(driver);




    }
}
