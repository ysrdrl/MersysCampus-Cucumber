package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest",

        features = {"src/test/java/FeatureFiles/Education/SubjectCategories.feature"},

        glue = {"StepDefinitions"},

        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}

)

public class SmokeTest extends AbstractTestNGCucumberTests {

}
