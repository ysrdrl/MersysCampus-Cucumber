package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = {"html:target//cucumber-reports.html"} // Cucumber Report


)

public class ParalelTest extends AbstractTestNGCucumberTests {

    @BeforeClass // bazı java versiyon hatalırı için
    @Parameters("browser")
    public void browserSet(String browser) {

        GWD.threadBrowserName.set(browser);

    }

}
