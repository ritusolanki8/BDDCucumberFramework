package runner.uiRunner;

import com.ui.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.ui.BaseClass.loadProperties;
@CucumberOptions(
    features = "src/test/resources/features",
        glue={"stepDefinitions/ui","stepDefinitions/support/ui"},
        plugin={
                "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            "html: target/report/cucumber.html",
                "json:target/report/cucumber.json"},
        dryRun = false,
        //tags= "@Register_dropDown"
        //tags = "@Login_test_case_1"
        tags = "@iframe_handling"

)
public class TestRunner extends AbstractTestNGCucumberTests {
    String cucumberTag;

    @BeforeSuite
    public void setUp()
    {
        loadProperties();
        System.out.println("Launching Browser");
        BaseClass.launchBrowser();

    }
    @AfterSuite
    public void tearDown(){
        BaseClass.closeBrowser();
    }

}
