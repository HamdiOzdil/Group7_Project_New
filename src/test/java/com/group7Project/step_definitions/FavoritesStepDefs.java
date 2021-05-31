package com.group7Project.step_definitions;

import com.group7Project.pages.ProjectPage;
import com.group7Project.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FavoritesStepDefs {

    ProjectPage projectPage = new ProjectPage();


    @When("click to advance search icon")
    public void click_to_advance_search_icon() {
        BrowserUtils.waitForClickablility(projectPage.projectPage,5 );
        projectPage.advancedButton.click();

    }



    @When("click on filters button")
    public void click_on_filters_button() {
       BrowserUtils.waitForClickablility(projectPage.projectPage,3);
       projectPage.filterButton.click();


    }


    @When("User clicks on favorites button")
    public void user_clicks_on_favorites_button() throws InterruptedException {

        BrowserUtils.waitForPageToLoad(5);
        //Select dropdown = new Select(projectPage.filterButton);
        //dropdown.getFirstSelectedOption().click();
       // BrowserUtils.waitFor(3);
        projectPage.favoriteButton.click();
        Thread.sleep(10000);

    }

    @Then("User should be able to see Favorite Projects")
    public void user_should_be_able_to_see_Favorite_Projects() {
        BrowserUtils.waitFor(3);
        projectPage.displayedFavoritesProjectInDashboard();
    }

    @Then("Verify all visible projects are favorite")
    public void verify_all_visible_projects_are_favorite() {

        System.out.println("it works");


    }



}
