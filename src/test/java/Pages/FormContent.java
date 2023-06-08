package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormContent extends Parent {

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchName;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement searchCode;

    @FindBy(xpath = "//button[contains(@class,'mat-raised-button')]")
    private WebElement searchButton;

    @FindBy(css = "ms-edit-button[class='ng-star-inserted']>button")
    private WebElement editButton;

    @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted']//button)[1]")
    private WebElement editButtonLocation;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButtonLocations;

    @FindBy(css = "mat-dialog-actions[class='mat-dialog-actions'] button[color='accent']")
    private WebElement deleteButton2;

    @FindBy(xpath = "(//mat-form-field[contains(@class,'mat-form-field')])[1]//input")
    private WebElement notificationSearchName;


    public FormContent() {

        PageFactory.initElements(GWD.getDriver(), this);

    }

    private WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "searchName":
                myElement = searchName;
//                if (!GWD.getDriver().findElement(By.xpath("//ms-delete-button//button")).isDisplayed()) {
//                    GWD.getWait().until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ms-delete-button//button"), 0));
//                }
                break;
            case "searchCode":
                myElement = searchCode;
                break;
            case "notificationSearchName":
//                if (!GWD.getDriver().findElement(By.xpath("//ms-delete-button//button")).isDisplayed()) {
//                    GWD.getWait().until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ms-delete-button//button"), 0));
//                }
                myElement = notificationSearchName;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "searchButton":
                myElement = searchButton;
                break;
            case "editButton":
                myElement = editButton;
               // GWD.getWait().until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-edit-button[class='ng-star-inserted']>button"), 1));
                GWD.getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
                break;
            case "deleteButton":
                myElement = deleteButton;
                GWD.getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
                break;
            case "deleteButton2":
                myElement = deleteButton2;
                break;
            case "editButtonLocation":
                myElement = editButtonLocation;
                break;
            case "deleteButtonLocations":
                myElement = deleteButtonLocations;
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
        findAndSend("searchName", searchText);
        findAndClick("searchButton");
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        findAndClick("deleteButton");
        findAndClick("deleteButton2");

    }

    public void waitElement(String strElement) {
        switch (strElement) {
            case "notificationSearchName":
                myElement = notificationSearchName;
                break;
            case "searchName":
                myElement = searchName;
                break;

        }
        waitUntilVisible(myElement);
    }


}
