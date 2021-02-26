package com.group7Project.step_definitions;

import com.group7Project.pages.LoginPage;
import com.group7Project.pages.ModulesPage;
import com.group7Project.utilities.ConfigurationReader;
import com.group7Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ModuleLinksStepDefs {

    ModulesPage modulesPage = new ModulesPage();
    @Given("Logs with {string}")
    public void logs_with(String userType) {


        Driver.get().get(ConfigurationReader.get("login_url")); // go to centrelli web site
        //based on input enter that user information
        String username =null;
        String password =null;
        if(userType.equals("posmanager")){
            username = ConfigurationReader.get("posmanager_username");
            password = ConfigurationReader.get("posmanager_password");
        }else if(userType.equals("sales manager")){
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        }else if(userType.equals("store manager")){
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }


    @When("the user navigates to {string}")
    public void the_user_navigates_to(String module) {
        modulesPage.navigateToModule(module);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String title) {
        Assert.assertEquals(Driver.get().getTitle(),title);
    }

}
