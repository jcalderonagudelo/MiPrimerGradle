package com.theinternet.herokuapp.automation.steps;

import com.theinternet.herokuapp.automation.pageobject.MessagePage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;


public class MessageStep {
    MessagePage messagePage = new MessagePage();

    @Step
    public void messageLlogin() {
        System.out.println(messagePage.messageLogin());
        Assertions.assertEquals("You logged into a secure area!", messagePage.messageLogin());
    }
}
