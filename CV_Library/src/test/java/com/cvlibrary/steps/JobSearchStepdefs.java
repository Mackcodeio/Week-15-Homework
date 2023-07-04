package com.cvlibrary.steps;

import com.cvlibrary.pages.JobSearch;
import com.cvlibrary.pages.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class JobSearchStepdefs {

    @When("^user on Homepage$")
    public void userOnHomepage() throws InterruptedException {
        new JobSearch().iframeHandle();
    }

    @When("^user enter job title 'jobTitle'$")
    public void userEnterJobTitleJobTitle() {
        new JobSearch().enterJobTitle("Software Developer");
    }

    @When("^user enter Location 'location'$")
    public void userEnterLocationLocation() {
        new JobSearch().enterLocation("London");
    }

    @When("^user select distance 'distance'$")
    public void userSelectDistanceDistance() {
        new JobSearch().selectDistanceDropDown("15 miles");
    }

    @When("^user click on moreSearchOptionsLink$")
    public void userClickOnMoreSearchOptionsLink() {
        new JobSearch().clickOnMoreSearchOptionLink();
    }

    @When("^user enter salaryMin 'salaryMin'$")
    public void userEnterSalaryMinSalaryMin() {
        new JobSearch().enterSalaryMin("35000");
    }

    @When("^user enter salaryMax 'salaryMax'$")
    public void userEnterSalaryMaxSalaryMax() {
        new JobSearch().enterSalaryMax("50000");
    }

    @When("^user select salaryType 'salaryType'$")
    public void userSelectSalaryTypeSalaryType() {
        new JobSearch().salaryTypeDropDown("Per annum");
    }

    @When("^user select jobType 'jobType'$")
    public void userSelectJobTypeJobType() {
        new JobSearch().salaryJobType("Permanent");
    }

    @When("^user click on 'Find Jobs' button$")
    public void userClickOnFindJobsButton() {
        new JobSearch().clickOnfindJob();
    }

    @Then("^user can see result \"([^\"]*)\"$")
    public void userCanSeeResult(String text) {
        Assert.assertEquals(text,new ResultPage().verifyText(),"Text Dosen't match");

    }
}
