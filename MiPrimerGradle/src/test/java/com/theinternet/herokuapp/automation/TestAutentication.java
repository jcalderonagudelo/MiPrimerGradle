package com.theinternet.herokuapp.automation;

import com.theinternet.herokuapp.automation.pageobject.MessagePage;
import com.theinternet.herokuapp.automation.steps.HomeStep;
import com.theinternet.herokuapp.automation.steps.LoginStep;
import com.theinternet.herokuapp.automation.steps.MessageStep;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;

public class TestAutentication {
    @Steps
    HomeStep homeStep = new HomeStep();
    @Steps
    LoginStep loginStep = new LoginStep();
    @Steps
    MessageStep messagePage = new MessageStep();

    @Test
    public void AutenticationInHerokuapp() throws InterruptedException {
        homeStep.openBrowser();
        homeStep.clickFormAuthentication();
        loginStep.login();
        Thread.sleep(4000);
        messagePage.messageLlogin();

    }
}
