package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.ConfigurationReader;
import com.group7Project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (id = "login")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = "[type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginAlert;

    @FindBy(css = "#login")
    public WebElement blankMessage;

    public void login(String username, String password){
        BrowserUtils.waitForPageToLoad(10);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void verifyWrongMessage(String expectedMessage){
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
        Assert.assertEquals(expectedMessage,actualAlert);
    }

    public void verifyBlankMessage(String expectedMessage){
        String actualAlert = "";
        try
        {
            BrowserUtils.waitForVisibility(blankMessage,5);
            actualAlert = blankMessage.getAttribute("validationMessage");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }
        System.out.println(actualAlert);
        System.out.println(expectedMessage);
        Assert.assertEquals(expectedMessage,actualAlert,"Please fill out this field.");
    }

}
