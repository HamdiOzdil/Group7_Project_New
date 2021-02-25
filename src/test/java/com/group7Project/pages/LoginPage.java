package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
    public WebElement blankEmail;

    @FindBy(css = "#password")
    public WebElement blankPassword;

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

    public void verifyBlankMessage(String expectedMessage, String username, String password){
        if(username.isBlank()){
            Assert.assertEquals(expectedMessage,blankEmail.getAttribute("validationMessage")); }
        if(password.isBlank()){
            Assert.assertEquals(expectedMessage,blankPassword.getAttribute("validationMessage")); } }


    public void verifySuccessfulLogin(){
        String expectedTitle = "Odoo";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }


    public void enterCredentials(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

}
