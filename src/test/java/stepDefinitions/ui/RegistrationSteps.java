package stepDefinitions.ui;

import com.ui.BaseClass;
import io.cucumber.java.en.*;

import static com.ui.pages.PageFactoryLoader.registrationPage;

public class RegistrationSteps extends BaseClass{

    @Given("launches the url")
    public void launches_the_url() {
        pageFactoryLoader.loadPageFactory(driver);
    }
    @When("user select the value from drop-down")
    public void user_select_the_value_from_drop_down() throws InterruptedException {
        registrationPage.dropdownValue();
    }
    @Then("value is selected from drop-down options")
    public void value_is_selected_from_drop_down_options() throws InterruptedException{
        registrationPage.verifySelectedDropDownValue();
    }
}
