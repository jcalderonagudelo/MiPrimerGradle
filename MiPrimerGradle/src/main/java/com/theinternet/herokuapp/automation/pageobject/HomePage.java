package com.theinternet.herokuapp.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://the-internet.herokuapp.com/")
public class HomePage extends PageObject {

    By formAuthentication = By.xpath("//a[@href='/login']");

    public void clickFormAuthentication(){
        getDriver().findElement(formAuthentication).click();
    }
}
