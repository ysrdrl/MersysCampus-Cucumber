package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before
    public void before() {
        System.out.println("The Scenario Started...");
    }

    @After
    public void after(Scenario scenario) throws IOException {
        System.out.println("Senaryo Bitti");
        System.out.println("Scenario Sonucu:" + scenario.getStatus());

        if (scenario.isFailed()) {
            System.out.println("Scenario isFailed:" + scenario.isFailed());
        }
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

        if (GWD.threadBrowserName.get().equals("firefox")) {
            ExcelUtility.writeExcel("src/test/java/ApachePOI/Resource/FirefoxScenarioStatus.xlsx", scenario, GWD.threadBrowserName.get(), date.format(formatter));
        }

        if (GWD.threadBrowserName.get().equals("chrome")) {
            ExcelUtility.writeExcel("src/test/java/ApachePOI/Resource/ChromeScenarioStatus.xlsx", scenario, GWD.threadBrowserName.get(), date.format(formatter));
        }



        if (scenario.isFailed()) {
            // klasöre
            TakesScreenshot screenshot = (TakesScreenshot) GWD.getDriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);
            //ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());

            try {
                FileUtils.copyFile(ekranDosyasi,
                        new File("target/FailedScreenShots/" + scenario.getId() + date.format(formatter) + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // ekran görüntüsü al senaryo hatalı ise
        GWD.quitDriver();


    }

    public String getBase64Screenshot() {
        return ((TakesScreenshot) GWD.getDriver()).getScreenshotAs(OutputType.BASE64);
    }


}
