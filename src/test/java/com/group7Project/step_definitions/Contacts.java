package com.group7Project.step_definitions;

import com.group7Project.pages.ChangeLanguagePage;
import com.group7Project.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Contacts {

    ChangeLanguagePage languagePage = new ChangeLanguagePage();

    @Given("Click to Contacts")
    public void click_to_Contacts() {
        languagePage.contacts.click();
    }

    @Then("Verify you are in Contacts Page")
    public void verify_you_are_in_Contacts_Page() {
        String currentUrl = Driver.get().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        Assert.assertEquals(currentUrl,"https://www.motork.io/contacts/");
    }


}
