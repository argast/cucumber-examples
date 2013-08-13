package com.github.argast.cucumber.examples;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@Component
public class Queue  {

    private List<Consumer> consumers = new ArrayList<Consumer>();

    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public void send(String message) {
        for (Consumer consumer : consumers) {
            consumer.consume(message);
        }
    }

    public void clear() {
        consumers.clear();
    }
}
