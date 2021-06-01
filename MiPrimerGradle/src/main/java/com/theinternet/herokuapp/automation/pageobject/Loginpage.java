package com.theinternet.herokuapp.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Loginpage extends PageObject {
    By userName = By.name("username");
    By password = By.id("password");
    By loginButton = By.xpath("//button[@type='submit']");

    public void setUserName(){
        getDriver().findElement(userName).clear();
        getDriver().findElement(userName).sendKeys("tomsmith");
    }
    public void setPassword(){
        getDriver().findElement(password).clear();
        getDriver().findElement(password).sendKeys("SuperSecretPassword!");
    }
    public void clickLoginButton(){
        getDriver().findElement(loginButton).click();
    }
}
