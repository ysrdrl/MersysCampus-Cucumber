package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest or RegressionTest",

        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = { "html:target//cucumber-reports.html" } // Cucumber Report
       // plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}

)
public class RegressionWithPlugin extends AbstractTestNGCucumberTests {
}
