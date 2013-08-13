package com.github.argast.cucumber.examples;

import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = "/cucumber.xml")
public class MessageSteps {

    @Autowired
    private MessageReceiver messageReceiver;

    @Then("^message \"([^\"]*)\" should be received$")
    public void thenMessageShouldBeReceived(String message) {
        messageReceiver.assertReceived(message);
    }

    @Then("^message \"([^\"]*)\" should not be received$")
    public void thenMessageShouldNotBeReceived(String message) {
        messageReceiver.assertNotReceived(message);
    }

}
