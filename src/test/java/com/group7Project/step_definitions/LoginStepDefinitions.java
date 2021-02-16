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

    @Given("User in the login page")
    public void user_in_the_login_page() {
        String loginUrl = ConfigurationReader.get("login_url");
        Driver.get().get(loginUrl);
    }

    @When("Logs with valid credentials")
    public void logs_with_valid_credentials() {
        String username = ConfigurationReader.get("posmanager_username");
        String password = ConfigurationReader.get("posmanager_password");

        loginPage.login(username,password);
    }

    @Then("User should be able to see main page")
    public void user_should_be_able_to_see_main_page() {
        String expectedTitle = "Odoo";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
