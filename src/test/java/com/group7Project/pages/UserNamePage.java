package com.group7Project.pages;

import com.group7Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserNamePage {


    public UserNamePage(){
        PageFactory.initElements( Driver.get(),this);
    }

    //both should be true
    @FindBy(xpath = "//span[@class='oe_topbar_name']")

    public WebElement username;

}
