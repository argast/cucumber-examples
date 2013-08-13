package com.github.argast.cucumber.examples;


import cucumber.api.java.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

public class Cleanup {

    @Autowired
    private Queue queue;

    @Autowired
    private MessageReceiver messageReceiver;

    @After
    public void cleanup() {
        queue.clear();
        // not needed as scope will create new instance for each scenario
        // messageReceiver.clear();
    }
}
