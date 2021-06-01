package com.theinternet.herokuapp.automation.steps;

import com.theinternet.herokuapp.automation.pageobject.Loginpage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    Loginpage loginStep = new Loginpage();

    @Step
    public void login (){
        loginStep.setUserName();
        loginStep.setPassword();
        loginStep.clickLoginButton();
    }
}
