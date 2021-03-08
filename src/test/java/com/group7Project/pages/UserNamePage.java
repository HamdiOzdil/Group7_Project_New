package com.group7Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserNamePage extends BasePage{

    @FindBy(xpath = "//a[text()='Documentation']")
    public WebElement documentation;

    @FindBy(xpath = "//a[text()='Support']")
    public WebElement support;

    @FindBy(xpath = "//a[text()='Preferences']")
    public WebElement preferences;

    @FindBy(xpath = "//a[text()='My Odoo.com account']")
    public WebElement my_odoo_com_account;

    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logOut;





}
