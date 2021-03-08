package com.group7Project.step_definitions;

import com.group7Project.pages.DashboardPage;
import com.group7Project.pages.PreferencesPage;
import io.cucumber.java.en.*;

public class AvatarStepDefinitions {

   DashboardPage dashboard = new DashboardPage();
   PreferencesPage preferencesPage = new PreferencesPage();

    @Then("User should be able to see their avatars")
    public void user_should_be_able_to_see_their_avatars() {

        dashboard.verifyAvatarDisplay();
    }

    @When("{string} navigates to preferences page")
    public void navigates_to_preferences_page(String usertype) {
     preferencesPage.navigateToPreferences(usertype);
    }

    @Given("take the screenshot of {string} avatar")
    public void take_the_screenshot_of_avatar(String string) {

    }

    @When("change the avatar with new one {string}")
    public void change_the_avatar_with_new_one(String string) {

    }


    @Then("verify the avatar has changed")
    public void verify_the_avatar_has_changed() {

    }




}
