package com.nopcommerce.steps;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStepsdefs {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new HomePage().setUsername(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new HomePage().setPassword(password);
    }

    @And("^I Click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @Then("^I should login successfully and see \"([^\"]*)\"$")
    public void iShouldLoginSuccessfullyAndSee(String text)  {
        Assert.assertEquals(text,new DashboardPage().verifyText(),"Text Dosen't match");
    }
}
