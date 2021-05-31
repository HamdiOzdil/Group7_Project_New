package com.group7Project.step_definitions;

import com.group7Project.pages.ChangeLanguagePage;
import com.group7Project.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ChangeLanguage {

    ChangeLanguagePage language = new ChangeLanguagePage();

    @When("click to language bar")
    public void click_to_language_bar() {
        try{
            BrowserUtils.clickWithJS(language.acceptButton);
        }catch (Exception e){
            System.out.println("no such element");
        }
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForVisibility(language.languageBar,5);
        language.languageBar.click();
        BrowserUtils.waitForVisibility(language.selectNewLanguage,5);

    }

    @When("select new language")
    public void select_new_language() {
        language.selectNewLanguage.click();
    }

    @Then("verify language is changed")
    public void verify_language_is_changed() {
        try{
            BrowserUtils.clickWithJS(language.acceptButton);
        }catch (Exception e){
            System.out.println("no such element");
        }
        Assert.assertEquals(language.languageBar.getText(),"IT");
        System.out.println("selected language = " + language.languageBar.getText());
    }

}
