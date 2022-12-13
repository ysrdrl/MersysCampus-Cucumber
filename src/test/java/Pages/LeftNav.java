package Pages;

import Utilities.GWD;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup;
    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countries;

    @FindBy(xpath = "(//span[text()='States'])[1]")
    private WebElement states;

    @FindBy(xpath = "(//span[text()='School Setup'])[1]")
    private WebElement schoolSetup;
    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement locations;

    @FindBy(xpath = "(//span[text()='Messaging'])[1]")
    private WebElement messaging;

    @FindBy(xpath = "(//span[text()='Notifications'])[1]")
    private WebElement notification;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement cookies;

    @FindBy(xpath = "(//span[text()='Education'])[1]")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement educationSetup;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private WebElement subjectCategories;



    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    private WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {


        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "setup":
                myElement=setup;
                break;
            case "parameters":
                myElement=parameters;
                break;
            case "countries":
                myElement=countries;
                break;
            case "states":
                myElement=states;
                break;
            case "schoolSetup":
                myElement=schoolSetup;
                break;
            case "locations":
                myElement=locations;
                break;
            case "messaging":
                myElement=messaging;
                break;
            case "notification":
                myElement=notification;
                break;
            case "cookies":
                myElement=cookies;
                break;
            case "education":
                myElement=education;
                break;
            case "educationSetup":
                myElement=educationSetup;
                break;
            case "subjectCategories":
                myElement=subjectCategories;
                break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {


        }
        verifyContainsText(myElement, text);
    }


    public void searchAndDelete(String searchText) {
        findAndSend("searchBox", searchText);
        findAndClick("searchButton");
        //GWD.getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        findAndClick("deleteButton");
        findAndClick("deleteButton1");

    }

}
