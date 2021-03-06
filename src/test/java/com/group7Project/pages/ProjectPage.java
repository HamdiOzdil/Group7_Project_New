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

public class ProjectPage {

    public ProjectPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createProjectBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@name='alias_name']")
    public WebElement emailInput;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBTN;

    @FindBy(xpath = "//div[@class='o_primary']/span[1]")
    public List<WebElement> projectNamesListOnTheDashboard;

    public boolean verifyProjectName(String exampleProject) throws InterruptedException {

        BrowserUtils.waitForPageToLoad(5);
        HashSet<String> uniqueProjectList = new HashSet<>();

        for (WebElement webElement : projectNamesListOnTheDashboard) {
            uniqueProjectList.add(webElement.getText());
            System.out.println(webElement.getText());
        }

        //BrowserUtils.waitForStaleElement(?);
        return uniqueProjectList.contains(exampleProject);
    }
}

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

