package com.group7Project.step_definitions;

import com.group7Project.pages.UserNamePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UserNameSteps {

UserNamePage userNamePage= new UserNamePage();

    @Then("User should be able to see username")
    public void user_should_be_able_to_see_username() {
        Assert.assertTrue( userNamePage.username.isDisplayed());


    }



}
