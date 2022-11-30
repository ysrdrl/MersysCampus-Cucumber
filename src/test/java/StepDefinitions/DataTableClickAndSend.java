package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class DataTableClickAndSend {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    FormContent fc=new FormContent();
    @And("Click on the element in the left nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {

        List<String> listElements = elements.asList(String.class);

        for (int i = 0; i < listElements.size(); i++) {
            ln.findAndClick(listElements.get(i));
        }

    }

    @And("Click on the element in the dialog content")
    public void clickOnTheElementInTheDialogContent(DataTable elements) {
        List<String> listElements=elements.asList(String.class);

        for (int i = 0; i < listElements.size(); i++) {
            dc.findAndClick(listElements.get(i));
        }

    }

    @And("User sending the keys in the dialog")
    public void userSendingTheKeysInTheDialog(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {
            dc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }

    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            dc.findAndContainsText(listElements.get(i).get(0),listElements.get(i).get(1));

        }

    }

    @And("User sending the keys in the form content")
    public void userSendingTheKeysInTheFormContent(DataTable elements) {
        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            fc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));


        }

    }

    @And("Click on the element in the form content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            fc.findAndClick(listElements.get(i));

        }
    }

    @And("User delete item from left nav")
    public void userDeleteItemFromLeftNav(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            fc.searchAndDelete(listElement.get(i));

        }

    }

    @And("Select on the element in the dialog content")
    public void selectOnTheElementInTheDialogContent(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {
            dc.ddMenu(listElements.get(i).get(0), listElements.get(i).get(1));

        }

    }
}
