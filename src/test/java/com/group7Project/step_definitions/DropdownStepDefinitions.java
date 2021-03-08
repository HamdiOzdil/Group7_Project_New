package com.group7Project.step_definitions;

import com.group7Project.pages.UserNamePage;
import com.group7Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropdownStepDefinitions {

    UserNamePage userNamePage = new UserNamePage();


    @Given("the user should be able to click on the username dropdown")
    public void the_user_should_be_able_to_click_on_the_username_dropdown() {
        userNamePage.username.click();

    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> expectedDropdown) {

        List <String> actualDropdown = new ArrayList<>();
        for (String each : expectedDropdown) {
           String eachDropdownLocator = "//a[text()='"+each+ "']";
            actualDropdown.add(Driver.get().findElement(By.xpath(eachDropdownLocator)).getText());

        }
        Assert.assertEquals (actualDropdown,expectedDropdown);
    }
}
