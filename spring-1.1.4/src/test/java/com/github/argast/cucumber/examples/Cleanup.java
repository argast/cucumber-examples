package com.github.argast.cucumber.examples;


import cucumber.api.java.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = "/cucumber.xml")
public class Cleanup {

    @Autowired
    private Queue queue;

    @Autowired
    private MessageReceiver messageReceiver;

    @After
    public void cleanup() {
        queue.clear();
        messageReceiver.clear();
    }
}
