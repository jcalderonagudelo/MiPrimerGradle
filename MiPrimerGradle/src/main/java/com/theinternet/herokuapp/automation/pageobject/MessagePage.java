package com.theinternet.herokuapp.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MessagePage extends PageObject {
    By messageLogin = By.id("flash");

    public String messageLogin() {
        return getDriver().findElement(messageLogin).getText();
    }
}

