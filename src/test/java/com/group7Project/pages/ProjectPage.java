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
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;

public class ProjectPage extends BasePage{

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

    @FindBy(xpath = "//*[@title='Remove from Favorites']")
    public List<WebElement> favoriteProjectsList;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBTN;

    @FindBy(xpath = "//div[@class='o_primary']/span[1]")
    public List<WebElement> projectNamesListOnTheDashboard;

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement advancedButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[1]/a")
    public WebElement favoriteButton;


    @FindBy(xpath = "//*[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'][1]")
    public WebElement filterButton;


   public boolean verifyFavoriteProjects(String x ){

       BrowserUtils.waitForPageToLoad(3);

       HashSet <String> y = new HashSet<>();

       for (WebElement webElement : favoriteProjectsList ){

           y.add(webElement.getText());

           System.out.println(webElement.getText());
       }
       return y.contains(x);

   }



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


   /* public void searchForProject (String project){

        searchBTN.sendKeys(project);
    }*/

    public void displayedFavoritesProjectInDashboard(){
        BrowserUtils.waitFor(1);
        for (WebElement eachProject : favoriteProjectsList){
            Assert.assertTrue(eachProject.getAttribute("title").contains("Remove"));
        }
    }







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

