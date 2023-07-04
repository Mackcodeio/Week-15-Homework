package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class JobSearch extends Utility {
    private static final Logger log = LogManager.getLogger(JobSearch.class.getName());

    public JobSearch() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "#nav-login")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement welcomeLogo;

    @CacheLookup
    @FindBy(css = "#keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(css = "#location")
    WebElement location;

    @CacheLookup
    @FindBy(css = "#distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement accept;

    @CacheLookup
    @FindBy(css = "div.hp-search-more>#toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(css = "#salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(css = "#salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(css = "#salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(css = "#tempperm")
    WebElement jobTypeDropDown;


    @CacheLookup
    @FindBy(css = "#hp-search-btn")
    WebElement findJobsBtn;



    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }

    public void clickOnLoginLink() {
        log.info("Click on Login Link");
        clickOnElement(loginLink);
    }

    public String getWelcomeLogo() {

        Reporter.log("get welcome text" +welcomeLogo.toString());
        return getTextFromElement(welcomeLogo);
    }
    public void enterJobTitle(String jobTitle1) {
        Reporter.log("Enter Job Title " +jobTitle1.toString());
        sendTextToElement(jobTitle, jobTitle1);
    }

    public void enterLocation(String location1) {
        Reporter.log("Enter Location" +location1.toString());
        sendTextToElement(location, location1);
    }

    public void selectDistanceDropDown(String distanceDropDown1) {
        Reporter.log("Select Distance" +distanceDropDown1.toString());
        sendTextToElement(distanceDropDown, distanceDropDown1);
    }

    public void clickOnMoreSearchOptionLink() {
        //return getTextFromElement(moreSearchOptionsLink);


        Reporter.log("Click on Login Link" +moreSearchOptionsLink.toString()+"<br>");
        clickOnElement(moreSearchOptionsLink);
    }

    public void clickAccpet(){
        clickOnElement(accept);
    }
    public void enterSalaryMin(String salaryMin1) {
        Reporter.log("Enter Min Salary" +salaryMin1.toString());
        sendTextToElement(salaryMin, salaryMin1);
    }

    public void enterSalaryMax(String salaryMax1) {
        Reporter.log("Enter Max Salary" +salaryMax1.toString());
        sendTextToElement(salaryMax, salaryMax1);
    }

    public void salaryTypeDropDown(String salaryTypeDropDown1) {
        Reporter.log("select type" +salaryTypeDropDown1.toString());
        sendTextToElement(salaryTypeDropDown, salaryTypeDropDown1);
    }

    public void salaryJobType(String jobTypeDropDown1) {
        Reporter.log("Job type" +jobTypeDropDown1.toString());
        sendTextToElement(jobTypeDropDown, jobTypeDropDown1);
    }

    public void clickOnfindJob() {
        Reporter.log("Click on find Job" +findJobsBtn.toString()+"<br>");
        clickOnElement(findJobsBtn);
    }
}
