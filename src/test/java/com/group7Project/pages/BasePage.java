package com.group7Project.pages;


import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(xpath = "(//span[contains(text(),'Discuss')])[1]")
    public WebElement discussPage;

    @FindBy(xpath = "(//span[contains(text(),'Calendar')])[1]")
    public WebElement calendarPage;

    @FindBy(xpath = "(//span[contains(text(),'Notes')])[1]")
    public WebElement notesPage;

    @FindBy(xpath = "(//span[contains(text(),'Contacts')])[1]")
    public WebElement contactsPage;

    @FindBy(xpath = "(//span[contains(text(),'Website')])[1]")
    public WebElement websitePage;

    @FindBy(xpath = "(//span[contains(text(),'Inventory')])[1]]")
    public WebElement inventoryPage;

    @FindBy(xpath = "(//span[contains(text(),'Manufacturing')])[1]")
    public WebElement manufacturingPage;

    @FindBy(xpath = "(//span[contains(text(),'Repairs')])[1]")
    public WebElement repairsPage;

    @FindBy(xpath = "(//span[contains(text(),'Invoicing')])[1]")
    public WebElement invoicingPage;

    @FindBy(xpath = "(//span[contains(text(),'Timesheets')])[1]")
    public WebElement timesheetsPage;

    @FindBy(xpath = "(//span[contains(text(),'Employees')])[1]")
    public WebElement employeesPage;

    @FindBy(xpath = "(//span[contains(text(),'Leaves')])[1]")
    public WebElement leavesPage;

    @FindBy(xpath = "(//span[contains(text(),'Expenses')])[1]")
    public WebElement expensesPage;

    @FindBy(xpath = "(//span[contains(text(),'Lunch')])[1]")
    public WebElement lunchPage;

    @FindBy(xpath = "(//span[contains(text(),'Maintenance')])[1]")
    public WebElement maintenancePage;

    @FindBy(xpath = "(//span[contains(text(),'Dashboards')])[1]")
    public WebElement dashboardsPage;

    @FindBy(xpath = "(//span[contains(text(),'Point of Sale')])[1]")
    public WebElement pointOfSalePage;

    @FindBy(xpath = "(//span[contains(text(),'Sales')])[1]")
    public WebElement salesPage;

    @FindBy(xpath = "(//span[contains(text(),'CRM')])[1]")
    public WebElement crmPage;

    @FindBy(xpath = "(//span[contains(text(),'Email Marketing')])[1]")
    public WebElement emailMarketingPage;

    @FindBy(xpath = "(//span[contains(text(),'Events')])[1]")
    public WebElement eventsPage;

    @FindBy(xpath = "(//span[contains(text(),'Fleet')])[1]")
    public WebElement fleetPage;

    @FindBy(xpath = "(//span[contains(text(),'Surveys')])[1]")
    public WebElement surveysPage;

    @FindBy(xpath = "(//span[contains(text(),'Project')])[1]")
    public WebElement projectPage;

    @FindBy(xpath = "(//span[contains(text(),'Attendances')])[1]")
    public WebElement attendancesPage;

    @FindBy(xpath = "//a[contains(text(),'More')]")
    public WebElement moreButton;

    @FindBy(xpath = "//i[@class=\"fa fa-clock-o\"]")
    public WebElement activities;

    public void verifyModuleNamesRelatedToUsers(List<String> modulesList){

        BrowserUtils.waitForPageToLoad(5);
        for (String each : ExpectedModuleList(modulesList)){
                BrowserUtils.waitForPageToLoad(5);
                String moduleNameLocator = "//span[contains(text(),'" + each + "')]";
                Assert.assertTrue(Driver.get().findElement(By.xpath(moduleNameLocator)).isDisplayed());
        }
    }
    private List<String> ExpectedModuleList(List<String> modulesList) {
                List<String> expectedModuleList = new ArrayList<>();
                for (String each : modulesList) {
                    if (!each.equals("-")) expectedModuleList.add(each);
                }
                return expectedModuleList;

    }



    public void navigateToModule(String module) {
        // String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        System.out.println("Hello2");
        String moduleLocator = "(//span[contains(text(),'"+module+"')])[1]";
        System.out.println("Hello3");

        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);
        }
    }




    public void verifyConversationsIsDisplayed(){
        Assert.assertTrue(conversations.isDisplayed());
    }

    public void verifyAvatarDisplay(){
        BrowserUtils.waitForVisibility(avatar,30);
        Assert.assertTrue(avatar.isDisplayed());
    }

    public void verifyActivitiesIsDisplayed(){
        Assert.assertTrue(activities.isDisplayed());
    }

    public void verifyModuleNamesBasedOnUserTypes(List<String> modulesList){
        clickOnTheMoreButton();
        for (String each : getExpectedModuleList(modulesList)){
            String moduleNameLocator = "//span[contains(text(),'" + each + "')]";
            Assert.assertTrue(Driver.get().findElement(By.xpath(moduleNameLocator)).isDisplayed());
        }
    }

    private List<String> getExpectedModuleList(List<String> modulesList) {
        List<String> expectedModuleList = new ArrayList<>();
        for (String each : modulesList) {
            if (!each.equals("-")) expectedModuleList.add(each);
        }
        return expectedModuleList;
    }

    private void clickOnTheMoreButton() {
        try {
            if (moreButton.isEnabled()) moreButton.click();
        }catch (ElementNotInteractableException e){
            e.printStackTrace();
        }
    }
}