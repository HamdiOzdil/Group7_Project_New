package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModuleLinksPage extends BasePage{


    public ModuleLinksPage() {
     PageFactory.initElements(Driver.get(),this);
}

    @FindBy(xpath = "//span[contains(text(),'Discuss')]")
    public WebElement modules ;



}
