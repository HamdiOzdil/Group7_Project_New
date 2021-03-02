package com.group7Project.step_definitions;

import com.group7Project.pages.DashboardPage;
import io.cucumber.java.en.*;

public class AvatarStepDefinitions {

   DashboardPage dashboard = new DashboardPage();

    @Then("User should be able to see their avatars")
    public void user_should_be_able_to_see_their_avatars() {

        dashboard.verifyAvatarDisplay();
    }

    @When("{string} navigates to preferences page")
    public void navigates_to_preferences_page(String string) {

    }

    @When("select new picture for avatar")
    public void select_new_picture_for_avatar() {

    }

    @Then("Verify that picture is changed")
    public void verify_that_picture_is_changed() {

    }

}
