package com.group7Project.step_definitions;

import com.group7Project.pages.DashboardPage;
import com.group7Project.pages.PreferencesPage;
import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Locale;

public class AvatarStepDefinitions {

   DashboardPage dashboard = new DashboardPage();
   PreferencesPage preferencesPage = new PreferencesPage();

    @Then("User should be able to see their avatars")
    public void user_should_be_able_to_see_their_avatars() {

        dashboard.verifyAvatarDisplay();
    }

    @Given("take the screenshot of {string} avatar")
    public void take_the_screenshot_of_avatar(String string) {

    }

    @When("{string} navigates to preferences page")
    public void navigates_to_preferences_page(String usertype) throws InterruptedException {
     preferencesPage.navigateToPreferences(usertype);
    }

    @When("Select new picture for avatar")
    public void select_new_picture_for_avatar() throws InterruptedException {
     String projectPath = System.getProperty("user.dir");
     String filePath = "/Users/mac/Desktop/upload_picture.png";
     String fullPath = projectPath+"/"+filePath;

     dashboard.imageControl.click();
     BrowserUtils.waitForVisibility(dashboard.imageControl,3);
     preferencesPage.uploadFile();

     dashboard.saveButton.click();

    }

    @When("change the avatar with new one {string}")
    public void change_the_avatar_with_new_one(String string) {

    }

    @Then("verify the avatar has changed")
    public void verify_the_avatar_has_changed() {

    }











}
