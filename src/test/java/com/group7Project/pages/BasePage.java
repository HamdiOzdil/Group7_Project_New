package com.group7Project.pages;


import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//img[@class='img-circle oe_topbar_avatar']")
    public WebElement avatar;

    @FindBy(xpath = "//*[@title='Conversations']")
    public WebElement conversations;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement username;

    public void verifyConversationsIsDisplayed(){
        Assert.assertTrue(conversations.isDisplayed());
    }

    public void verifyAvatarDisplay(){
        BrowserUtils.waitForVisibility(avatar,30);
        Assert.assertTrue(avatar.isDisplayed());
    }



    //both should be true
    @FindBy(xpath = "//i[@class=\"fa fa-clock-o\"]")
    public WebElement activities;

    public void verifyActivitiesIsDisplayed(){
        Assert.assertTrue(activities.isDisplayed());
    }

}