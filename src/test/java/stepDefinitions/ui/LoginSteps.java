package stepDefinitions.ui;

import com.ui.BaseClass;
import io.cucumber.java.en.*;

import static com.ui.pages.PageFactoryLoader.loginPage;

public class LoginSteps extends BaseClass{

    @Given("user launches the browser with url")
    public void user_launches_the_browser_with_url() {
        pageFactoryLoader.loadPageFactory(driver);

    }
    @When("user enters the email id and click on next button")
    public void user_enters_the_email_id_and_click_on_next_button() throws InterruptedException{

        loginPage.loginToPage();

    }
    @Then("user should be seeing the register page")
    public void user_should_be_seeing_the_register_page() {
        loginPage.verifyPageHeaders();

    }

}
