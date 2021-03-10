package com.group7Project.step_definitions;

import com.group7Project.pages.ProjectPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NumberOfProjectStepsDefs {
ProjectPage projectPage=new ProjectPage();


    @Then("the user should be able to see exact total number of projects")
    public void the_user_should_be_able_to_see_exact_total_number_of_projects() {
        int expectedProjectNumber = projectPage.ListingTheProject().size();
//        int actualProjectNumber = Integer.parseInt( projectPage.numberOfProjects.getText() );
//        Assert.assertEquals( expectedProjectNumber, actualProjectNumber )

    }
}
