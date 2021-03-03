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
   PreferencesPage changeAvatar = new PreferencesPage();

    @Then("User should be able to see their avatars")
    public void user_should_be_able_to_see_their_avatars() {

        dashboard.verifyAvatarDisplay();
    }

    @When("{string} navigates to preferences page")
    public void navigates_to_preferences_page(String usertype) throws InterruptedException {
     Assert.assertTrue(dashboard.username.getText(),usertype.toLowerCase(Locale.ROOT).contains(usertype));
     dashboard.username.click();
     dashboard.preferences.click();
    }

    @When("Select new picture for avatar")
    public void select_new_picture_for_avatar() throws InterruptedException {
     String projectPath = System.getProperty("user.dir");
     String filePath = "/Users/mac/Desktop/upload_picture.png";
     String fullPath = projectPath+"/"+filePath;

     dashboard.imageControl.click();
     BrowserUtils.waitForVisibility(dashboard.imageControl,3);

     dashboard.saveButton.click();






    }

    @Then("Verify that picture is changed")
    public void verify_that_picture_is_changed() {

    }

}
