package stepDefinitions.support.ui;


import com.ui.BaseClass;
import io.cucumber.java.*;
import io.cucumber.plugin.event.PickleStepTestStep;

import java.util.Collection;
import java.util.HashMap;

//import static BaseClass.*;
import static com.ui.BaseClass.*;

public class Hooks {
        public static  Scenario cScenario;
        private static HashMap<Integer,String> scenarios;
        PickleStepTestStep currentStep;
        private int counter = 0;
        public Hooks() {
            if(scenarios == null)
                scenarios = new HashMap<Integer,String>();
        }

        @Before(order =0)
        public static void initialization(Scenario scenario)
        {
            cScenario = scenario;
            Collection<String> tags = cScenario.getSourceTagNames();
            setScenario(scenario);
            launchUrl();
            pageFactoryLoader.loadPageFactory(driver);
            setScenario(scenario);
            scenario.log("Executed step: Started");
            System.out.println("Starting Scenario: " + scenario.getName());
        }

        @BeforeStep
        public void afterBeforeStep(Scenario scenario)
        {
            System.out.println(scenario.getSourceTagNames());
            System.out.println("Started exeucting scenario "+scenario.getName());

        }

        @AfterStep
        public void afterEveryStep(Scenario scenario)
        {
            BaseClass.TakesScreenshot(scenario);
            System.out.println("Completdd exeucting scenario "+scenario.getName());
        }


        @After(order = 0)
        public void afterScenario(Scenario scenario){
            //fileUtil.createDirectoryAtProjectPath("reportLogs");
            driver.manage().deleteAllCookies();
            //driver.quit();

            BaseClass.TakesScreenshot(scenario);
            System.out.println("Finished scenario: " + scenario.getName());
            System.out.println("Completed Scenario: " + scenario.getName());
        }



    }




