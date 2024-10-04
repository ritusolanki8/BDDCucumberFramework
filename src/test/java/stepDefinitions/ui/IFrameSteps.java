package stepDefinitions.ui;

import com.ui.BaseClass;
import io.cucumber.java.en.*;
import static com.ui.pages.PageFactoryLoader.iframe;

public class IFrameSteps extends BaseClass {
    @Given("user launches the browser with new url")
    public void user_launches_the_browser_with_new_url() {
        pageFactoryLoader.loadPageFactory(driver);
    }
    @When("user enters the value in input iframe")
    public void user_enters_the_value_in_input_iframe() throws InterruptedException {
        //iframe.iFrameTest();
        iframe.withInAnIframe();
    }
    @Then("user should be seeing entered value")
    public void user_should_be_seeing_entered_value() {

    }

}
