package com.group7Project.step_definitions;

import com.group7Project.pages.DashboardPage;
import com.group7Project.pages.ProjectPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;

public class CreateNewProjectStepDefs {

    ProjectPage projectPage = new ProjectPage();
    String exampleNameInput =  "hamdi";
    String exampleEmailInput = "deneme";

    /*@When("navigates to {string}")
    public void navigates_to_project_page(String module) {
        new DashboardPage().navigateToModule(module);
    }*/

    @Then("the user should be able to create a new project")
    public void the_user_should_be_able_to_create_a_new_project() {
        try{
            projectPage.createProjectBtn.click();
            projectPage.nameInput.sendKeys(exampleNameInput);
            projectPage.emailInput.sendKeys(exampleEmailInput);
            projectPage.createBtn.click();

            Assert.assertTrue(projectPage.verifyProjectName(exampleNameInput));
        }catch(Exception e){
        }
    }
}
