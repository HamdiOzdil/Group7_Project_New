package com.group7Project.step_definitions;

import com.group7Project.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class AvatarStepDefinitions {

   DashboardPage dashboard = new DashboardPage();

    @Then("User should be able to see their avatars")
    public void user_should_be_able_to_see_their_avatars() {

        dashboard.verifyAvatarDisplay();
    }

}
