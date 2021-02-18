package com.group7Project.step_definitions;

import com.group7Project.pages.LoginPage;
import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NegativeLoginStepDefs {

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginAlert;

    LoginPage loginPage = new LoginPage();

    @When("user input login with wrong credentials")
    public void user_input_login_with_wrong_credentials() {
        String wrongUsername = ConfigurationReader.get("wrongUsername");
        String wrongPassword = ConfigurationReader.get("wrongPassword");

        loginPage.login(wrongUsername,wrongPassword);
    }

    @Then("Wrong login or password should be seen")
    public void wrong_login_password_should_be_seen() {

        String expectedAlert = "Wrong login/password";

        String actualAlert ="";
        try
        {
            BrowserUtils.waitForVisibility(wrongLoginAlert,5);
            actualAlert = wrongLoginAlert.getText().trim();
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }


        Assert.assertEquals(expectedAlert,actualAlert);
    }

}
