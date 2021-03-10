package com.group7Project.step_definitions;

import com.group7Project.pages.PasswordPage;
import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ChangeOfPasswordStepsDefs {




    @And("user navigates to {string}")
    public void userNavigatesTo(String arg0) {
        PasswordPage passwordPage = new PasswordPage();
        BrowserUtils.waitForVisibility( passwordPage.userInfoTab, 10 );
        passwordPage.userInfoTab.click();

        BrowserUtils.waitFor ( 3 );
        passwordPage.preferences.click();


    }
    @Then("user should be able to change password")
    public void userShouldBeAbleToChangePassword() {

        PasswordPage passwordPage = new PasswordPage();
        BrowserUtils.waitForVisibility(passwordPage.changePasswordLink,5 );
        passwordPage.changePasswordLink.click();
        BrowserUtils.waitForVisibility(passwordPage.oldPassword,5 );
        passwordPage.oldPassword.sendKeys( ConfigurationReader.get( "posmanager_password" ) );
        passwordPage.newPassword.sendKeys( ConfigurationReader.get( "newpasword" ) );
        passwordPage.confirmNewPassword.sendKeys( ConfigurationReader.get( "newpasword" ) );
        passwordPage.changePasswordButton.click();


    }
}
