package com.nhs.steps;

import com.nhs.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class NHSStepdefs {
    @When("^user on Homepage$")
    public void userOnHomepage() throws InterruptedException {
        new Homepage().iframeHandle();
    }

    @When("^user enter job title \"([^\"]*)\"$")
    public void userEnterJobTitle(String text)  {
        System.out.println("Home page of Text "+text);
        new Homepage().setTextBox(text);
    }

    @And("^user click on search button$")
    public void userClickOnSearchButton() {
        new Homepage().setSearchButton();
    }


    @When("^user click on Paan, bidi and shisha$")
    public void userClickOnPaanBidiAndShisha() {
        new Homepage().setclickOnElement();
    }

    @Then("^Verify text \"([^\"]*)\"$")
    public void verifyText(String text)  {
        Assert.assertEquals(text,new Homepage().verifyText(),"Text Dosen't match");

    }

}
