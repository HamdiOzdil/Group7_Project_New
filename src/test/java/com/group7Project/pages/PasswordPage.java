package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.ConfigurationReader;
import com.group7Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage extends BasePage {

    public PasswordPage () {
        PageFactory.initElements( Driver.get(), this);
    }
    @FindBy(xpath ="//span[contains(text(),'POSManager')]")
    public WebElement userInfoTab;

    @FindBy(xpath ="//a[contains(text(),'Preferences')]")
    public WebElement preferences;

    @FindBy(xpath ="//span[contains(text(),'Change password')]")
    public WebElement changePasswordLink;

    @FindBy(xpath ="//tbody/tr[1]/td[2]/input[1]")
    public WebElement oldPassword;

    @FindBy(xpath ="//tbody/tr[2]/td[2]/input[1]")
    public WebElement newPassword;

    @FindBy(xpath ="//tbody/tr[3]/td[2]/input[1]")
    public WebElement confirmNewPassword;

    @FindBy(xpath ="    //button[contains(text(),'Change Password')]")
    public WebElement changePasswordButton;

    public void changePassword () {


        BrowserUtils.waitForClickablility(changePasswordLink, 10);
        changePasswordLink.click();

        BrowserUtils.waitForVisibility (oldPassword, 10);
        oldPassword.sendKeys( ConfigurationReader.get("posmanager_password"));
        newPassword.sendKeys( ConfigurationReader.get("newpasword"));
        confirmNewPassword.sendKeys( ConfigurationReader.get("newpasword"));
        changePasswordButton.click();

    }


    public void changePassword (String password) {


        BrowserUtils.waitForClickablility(changePasswordLink, 10);
        changePasswordLink.click();

        BrowserUtils.waitForVisibility (oldPassword, 10);
        oldPassword.sendKeys( ConfigurationReader.get("posmanager_password"));
        newPassword.sendKeys( password );
        confirmNewPassword.sendKeys( password);
        changePasswordButton.click();


    }





}
