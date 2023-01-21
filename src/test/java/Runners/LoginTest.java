package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/FeatureFiles/Login/Login.feature",
                "src/test/java/FeatureFiles/Education/SubjectCategories.feature"},
        glue = {"StepDefinitions"}

)

public class LoginTest extends AbstractTestNGCucumberTests {
}

