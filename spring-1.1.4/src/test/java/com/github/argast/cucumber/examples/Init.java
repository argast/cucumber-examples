package com.github.argast.cucumber.examples;

import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = "/cucumber.xml")
public class Init {

    @Autowired
    private Queue queue;

    @Autowired
    private MessageReceiver receiver;

    @Before
    public void setupConsumers() {
        queue.addConsumer(receiver);
    }
}
