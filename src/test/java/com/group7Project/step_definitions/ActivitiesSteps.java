package com.group7Project.step_definitions;

import com.group7Project.pages.BasePage;
import com.group7Project.pages.DashboardPage;
import com.group7Project.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ActivitiesSteps {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("User should be able to see activities hover over")
    public void user_should_be_able_to_see_activities_hover_over() {
        dashboardPage.verifyActivitiesIsDisplayed();



    }
}
