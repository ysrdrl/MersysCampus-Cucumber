package Runners;

import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = {"html:target//cucumber-reports1.html"} // Cucumber Report


)
@Listeners({ExtentITestListenerClassAdapter.class})
public class ParalelTest extends AbstractTestNGCucumberTests {

    @BeforeClass // bazı java versiyon hatalırı için
    @Parameters("browser")
    public void browserSet(String browser) {

        GWD.threadBrowserName.set(browser);

    }

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "İsmet Temur");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
    }

}
