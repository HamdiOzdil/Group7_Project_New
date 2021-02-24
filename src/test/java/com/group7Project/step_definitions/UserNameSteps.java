package com.group7Project.step_definitions;

import com.group7Project.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UserNameSteps {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("User should be able to see username")
    public void user_should_be_able_to_see_username() {
        Assert.assertTrue(dashboardPage.username.isDisplayed());
    }

}
