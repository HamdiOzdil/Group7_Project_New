package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;
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


    @FindBy(xpath = "//div[@class='o_primary']/span[1]")
    public List<WebElement> projectNamesListOnTheDashboard;

    @FindBy(xpath ="//span[@class='o_pager_limit']")
    public WebElement limitElement;

    public int numberOfProject= Integer.parseInt( limitElement.getAttribute("value"));

    public boolean verifyNumberOfProjects() {
        BrowserUtils.waitForPageToLoad( 5 );
        if (numberOfProject == projectNamesListOnTheDashboard.size()) {
            return true;

        } else {
            return false;
        }

    }

}


