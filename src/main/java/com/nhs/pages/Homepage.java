package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "#search-field")
    WebElement textBox;

    @CacheLookup
    @FindBy(css = "button[type='submit']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Paan, bidi and shisha']")
    WebElement clickOnElement;

    @CacheLookup
    @FindBy(css = "p[data-block-key='al0v0']")
    WebElement vefiyText;

    public void iframeHandle() throws InterruptedException {
        driver.findElement(By.cssSelector("#nhsuk-cookie-banner__link_accept_analytics")).click();
        driver.switchTo().defaultContent();
    }

    public void setTextBox(String textBoxValue){
        sendTextToElement(textBox, textBoxValue);
    }

    public void setSearchButton(){
        clickOnElement(searchButton);
    }

    public void setclickOnElement(){
        clickOnElement(clickOnElement);
    }

    public String verifyText(){
        log.info("Getting text from: "+ vefiyText.toString());
        return getTextFromElement(vefiyText);
    }

    public void hello(){
        System.out.println("Hello All");
    }

}
