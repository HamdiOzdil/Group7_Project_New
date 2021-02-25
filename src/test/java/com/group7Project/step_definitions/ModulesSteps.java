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

    DashboardPage dashboardPage = new DashboardPage();
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        String username =null;
        String password =null;
        if(userType.equals("pos manager")){
            username = ConfigurationReader.get("posmanager_username");
            password = ConfigurationReader.get("posmanager_password");
        }else if(userType.equals("sales manager")){
            username = ConfigurationReader.get("salesmanager_username");
            password = ConfigurationReader.get("salesmanager_password");
        }else if(userType.equals("expenses manager")){
            username = ConfigurationReader.get("expensesmanager_username");
            password = ConfigurationReader.get("expensesmanager_password");
        }else if(userType.equals("inventory manager")){
            username = ConfigurationReader.get("inventorymanager_username");
            password = ConfigurationReader.get("inventorymanager_password");
        }else if(userType.equals("manufacturing user")){
            username = ConfigurationReader.get("manufacturinguser_username");
            password = ConfigurationReader.get("manufacturinguser_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }




    @Then("User should see following options {string}")
    public void user_should_see_following_options(List <String> modulesList) {
        dashboardPage.verifyModuleNamesRelatedToUsers(modulesList);

    }

    @Then("the user should be able to see following modules")
    public void the_user_should_be_able_to_see_following_modules(List<String> modules){
        dashboardPage.verifyModuleNamesBasedOnUserTypes(modules);
    }



}

