package steps;

import com.qacart.base.Base;
import com.qacart.pages.ContactsPage;
import com.qacart.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ContactsSteps extends Base {

    HomePage homePage;
    ContactsPage contactsPage;

    @And("User clicks on contacts button")
    public void user_clicks_on_contacts_button(){
        homePage = new HomePage();
        contactsPage = homePage.clickcontactButton();
    }

    @Then("Email text field should be visible")
    public void email_text_field_should_be_visible(){
        contactsPage.isEmailFieldVisible();
    }

    @And("User clicks on new contact button")
    public void userClicksOnNewContactButton() {
        contactsPage.clickOnNewContactButton();
    }

    @And("Fill the firstname and lastname")
    public void fillTheFirstnameAndLastname() {
        contactsPage.enterData("Ziad","Test");
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        contactsPage.clickOnSave();
    }

    @Then("New contact should be added")
    public void newContactShouldBeAdded() {
        contactsPage.isContactAdded();
    }
}
