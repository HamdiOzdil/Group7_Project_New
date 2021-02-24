package com.group7Project.step_definitions;
import com.group7Project.pages.DashboardPage;
import com.group7Project.pages.LoginPage;
import com.group7Project.pages.ModulesPage;
import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.ConfigurationReader;
import com.group7Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;

public class ModulesSteps {

    ModulesPage modulesPage = new ModulesPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

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




    @Then("User should see following options {string}")
    public void user_should_see_following_options(List <String> moduleOptions) {

    }



}

