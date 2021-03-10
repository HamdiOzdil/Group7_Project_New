package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;

public class ProjectPage extends BasePage{

    public ProjectPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBTN;

    @FindBy(xpath = "//div[@class='o_primary']/span[1]")
    public List<WebElement> projectNamesListOnTheDashboard;

    @FindBy(className = "o_pager_limit")
    public WebElement numberOfProjects;

   /* public void searchForProject (String project){

        searchBTN.sendKeys(project);
    }*/

    public HashSet<String> ListingTheProject() {

        BrowserUtils.waitForPageToLoad(5);
        HashSet<String> expectedProjectList = new HashSet<>();

        for (WebElement webElement : projectNamesListOnTheDashboard) {
            expectedProjectList.add(webElement.getText());
        }

        for (String s : expectedProjectList) {
            System.out.println(s);
        }

        return expectedProjectList;

    }
}

