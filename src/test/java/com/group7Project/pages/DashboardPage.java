package com.group7Project.pages;


import com.group7Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage  {

          public DashboardPage(){
            PageFactory.initElements(Driver.get(),this);
        }

        //both should be true
        @FindBy(xpath = "//i[@class=\"fa fa-clock-o\"]")
        public WebElement activities;

    public void activities(){
        activities.click();
    }
}
