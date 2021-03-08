package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ProjectPage {

    public ProjectPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBTN;

    @FindBy(xpath = "//div[@class='o_primary']/span[1]")
    public List<WebElement> projectNamesListOnTheDashboard;


   /* public void searchForProject (String project){

        searchBTN.sendKeys(project);
    }*/

//    public List<String> projectNamesListOnTheDashboard () {
//        BrowserUtils.waitForPageToLoad(5);
//        List<String> expectedProjectList = new ArrayList<>();
//        for (WebElement each : projectNamesListOnTheDashboard) {
//            System.out.print( expectedProjectList.add(each));
//        }
//        return expectedProjectList;
//


   /* public void verifyModuleNamesRelatedToUsers(List<String> projectList){

        BrowserUtils.waitForPageToLoad(5);
        for (String each : expectedProjectList(projectList)){
            BrowserUtils.waitForPageToLoad(5);
            String moduleNameLocator = "//span[contains(text(),'" + each + "')]";
            Assert.assertTrue(Driver.get().findElement(By.xpath(moduleNameLocator)).isDisplayed());*/
        }
//    }




