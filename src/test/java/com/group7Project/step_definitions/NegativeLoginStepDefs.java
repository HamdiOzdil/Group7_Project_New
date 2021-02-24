package com.group7Project.step_definitions;

import com.group7Project.pages.LoginPage;
import io.cucumber.java.en.*;

public class NegativeLoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @When("user input login with wrong credentials {string} {string}")
    public void user_input_login_with_wrong_credentials(String username, String password) {

        loginPage.login(username,password);
    }

    @Then("user should see wrong {string}")
    public void user_should_see_wrong(String message) {

        loginPage.verifyWrongMessage(message);
    }

    @When("user input login with blank credentials {string} {string}")
    public void user_input_login_with_blank_credentials(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("user should see blank {string}")
    public void user_should_see_blank(String message) {
        loginPage.verifyBlankMessage(message);
    }

}
