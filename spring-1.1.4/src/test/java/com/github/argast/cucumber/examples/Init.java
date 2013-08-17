package com.github.argast.cucumber.examples;

import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class Init extends DefaultCucumberSpringContextConfiguration {

    @Autowired
    private Queue queue;

    @Autowired
    private MessageReceiver receiver;

    @Before
    public void setupConsumers() {
        queue.addConsumer(receiver);
    }
}
