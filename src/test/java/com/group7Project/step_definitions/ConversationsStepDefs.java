package com.group7Project.step_definitions;

import com.group7Project.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class ConversationsStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user should be able to see Conversations link on the top menu")
    public void the_user_should_be_able_to_see_Conversations_link_on_the_top_menu() {
        dashboardPage.verifyConversationsIsDisplayed();
    }

}
