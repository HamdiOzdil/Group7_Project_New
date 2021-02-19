package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.ConfigurationReader;
import com.group7Project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //both should be true
    @FindBy (id = "login")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = "[type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginAlert;

    @FindBy(xpath = "//label[text()='Email']")
    public WebElement blankMessage;

    public void login(String username, String password){
        BrowserUtils.waitForPageToLoad(10);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void verifyWrongMessage(String expectedMessage){
        Assert.assertEquals(expectedMessage,wrongLoginAlert.getText());
    }

    public void verifyBlankMessage(String expectedMessage){
        Assert.assertEquals(expectedMessage,blankMessage.getAttribute("validationMessage"));
    }

}
