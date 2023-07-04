package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = ".search-header__title")
    WebElement tragetText;


    public String verifyText(){
        log.info("Getting text from: "+ tragetText.toString());
        return getTextFromElement(tragetText);
    }
}
