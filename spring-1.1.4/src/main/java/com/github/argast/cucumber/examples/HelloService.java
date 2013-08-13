package com.github.argast.cucumber.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    @Autowired
    private Queue queue;

    public void sendHello(Object name) {
        queue.send("Hello, " + name);
    }
}
