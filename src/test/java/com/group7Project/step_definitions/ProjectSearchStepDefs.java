package com.group7Project.step_definitions;

import com.group7Project.pages.BasePage;
import com.group7Project.pages.DashboardPage;
import com.group7Project.pages.ProjectPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ProjectSearchStepDefs {
    ProjectPage projectPage = new ProjectPage();
    @When("navigates to {string}")
        public void navigates_to_project_page(String module) {
        new DashboardPage().navigateToModule(module);

    }

    @When("the user should be able to see initial project list")
    public void the_user_should_be_able_to_see_initial_project_list() {
    projectPage.ListingTheProject();
    }

   /* @When("the user should be able to see search")
    public void the_user_should_be_able_to_see_search() {

        projectPage.searchForProject("Brite ERP");

    }*/

    @Then("the user should be able to see searched project")
    public void the_user_should_be_able_to_see_searched_project() {


    }
}
