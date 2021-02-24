package com.group7Project.step_definitions;

import com.group7Project.pages.LoginPage;
import com.group7Project.utilities.ConfigurationReader;
import com.group7Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Then("User should be able to see main page")
    public void user_should_be_able_to_see_main_page() {

        loginPage.verifySuccessfulLogin();


    }

    @When("Logs with valid credentials {string} {string}")
    public void logs_with_valid_credentials(String Username, String Password) {

        loginPage.login(Username,Password);
    }

}
