package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    @FindBy(css = "input[placeholder='Username']")
    private WebElement username;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement password;

    @FindBy(css = "span[class='nav-link-title']")
    private WebElement dashBoard;

    @FindBy(css = "button[aria-label='LOGIN']>span[class='mat-button-wrapper']")
    private WebElement loginButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "(//ms-add-button[contains(@tooltip,'.TITLE.ADD')]//button)[2]")
    private WebElement addButtonStates;

    @FindBy(css = ".mat-slide-toggle-thumb")
    private WebElement stateExists;

    @FindBy(css = "ms-dialog-content[formgroup='[object Object]'] span[class='mat-slide-toggle-thumb']")
    private WebElement locationsActive;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME'])[2]//input")
    private WebElement nameInput;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME'])[1]//input")
    private WebElement nameInputOnly;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE'])[2]//input")
    private WebElement codeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(css = "dynamic-view[class='ng-star-inserted'] div")
    private WebElement successMessage;

    @FindBy(css = "mat-form-field[formgroupname='country']")
    private WebElement countryMenu;

    @FindBy(xpath = "//div[@role='listbox']//span[contains(text(),' United States of America ')]")
    private WebElement selectCountry;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD')])[3]//input")
    private WebElement shortName;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD')])[2]//input")
    private WebElement shortNameOnly;

    @FindBy(css = "span[class='mat-button-wrapper'] svg[class='svg-inline--fa fa-square-xmark']")
    private WebElement countryClosed;

    @FindBy(xpath = "(//ms-integer-field[contains(@placeholder,'GENERAL.FIELD.CAPACITY')])[1]//input")
    private WebElement capacity;

    @FindBy(xpath = "//mat-form-field[contains(@class,'mat-form-field-type-ms-text-field')]//input")
    private WebElement notificationName2;

    @FindBy(xpath = "(//mat-select[contains(@class,'mat-select-required')]//div)[3]")
    private WebElement notificationType;


    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement examInfo;

    @FindBy(xpath = "//mat-form-field[contains(@class,'mat-form-field-type-mat-input')]//textarea")
    private WebElement description;


    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    private WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "nameInputOnly":
                myElement = nameInputOnly;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "shortNameOnly":
                myElement = shortNameOnly;
                break;
            case "capacity":
                myElement = capacity;
                break;
            case "notificationName2":
                myElement = notificationName2;
                break;
            case "description":
                myElement = description;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "addButtonStates":
                myElement = addButtonStates;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "countryMenu":
                myElement = countryMenu;
                break;
            case "selectCountry":
                myElement = selectCountry;
                break;
            case "stateExists":
                myElement = stateExists;
                break;
            case "countryClosed":
                myElement = countryClosed;
                break;
            case "locationsActive":
                myElement = locationsActive;
                break;
            case "notificationType":
                myElement = notificationType;
                break;
            case "examInfo":
                myElement = examInfo;
                break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "dashBoard":
                myElement = dashBoard;
                break;
            case "successMessage":
                myElement = successMessage;
                break;

        }
        verifyContainsText(myElement, text);
    }

    public void ddMenu(String  element, String value) {

        switch (element) {
            case "countryMenu":
                myElement = countryMenu;
                break;

        }
        ddMenuParent(myElement, value);
    }


}
