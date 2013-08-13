package com.github.argast.cucumber.examples;

import cucumber.runtime.java.spring.GlueCodeScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Component
@Scope(GlueCodeScope.NAME)
public class MessageReceiver implements Consumer {

    private List<String> messages = new ArrayList<String>();

    @Override
    public void consume(String message) {
        messages.add(message);
    }

    public void assertReceived(String message) {
        assertTrue(messages.contains(message));
    }

    public void assertNotReceived(String message) {
        assertFalse(messages.contains(message));
    }
}
