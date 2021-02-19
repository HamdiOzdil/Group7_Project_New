package com.group7Project.step_definitions;

import com.group7Project.pages.LoginPage;
import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NegativeLoginStepDefs {



    LoginPage loginPage = new LoginPage();

    @When("user input login with wrong credentials")
    public void user_input_login_with_wrong_credentials() {
        String wrongUsername = ConfigurationReader.get("wrongUsername");
        String wrongPassword = ConfigurationReader.get("wrongPassword");

        loginPage.login(wrongUsername,wrongPassword);
    }

    @Then("Wrong login or password should be seen")
    public void wrong_login_password_should_be_seen() {

        loginPage.verifyWrongMessage("Wrong login/password");
    }
    @When("user input login with blank credentials")
    public void user_input_login_with_blank_credentials() {

        loginPage.login(ConfigurationReader.get("blankUsername"),
                        ConfigurationReader.get("blankPassword"));
    }

    @Then("Please fill out this field should be seen")
    public void please_fill_out_this_field_should_be_seen() {

        loginPage.verifyBlankMessage("Please fill out this field.");
    }

}
