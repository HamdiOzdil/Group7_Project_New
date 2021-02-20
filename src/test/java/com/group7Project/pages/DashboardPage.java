package com.group7Project.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//*[@title='Conversations']")
    public WebElement conversations;

    public void verifyConversationsIsDisplayed(){
        Assert.assertTrue(conversations.isDisplayed());
    }

}
