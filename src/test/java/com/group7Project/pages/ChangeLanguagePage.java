package com.group7Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeLanguagePage extends BasePage{

    @FindBy (xpath = "(//a[@aria-haspopup='true'])[5]")
    public WebElement languageBar;

    @FindBy (xpath = "(//a[text()='IT'])[1]")
    public WebElement selectNewLanguage;

    @FindBy (xpath = "(//a[text()='CONTACTS'])[1]")
    public WebElement contacts;

    @FindBy (xpath = "//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']")
    public WebElement acceptButton;



}
