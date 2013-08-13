package com.github.argast.cucumber.examples;


import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = "/cucumber.xml")
public class HelloSteps {

    @Autowired
    private HelloService helloService;

    @When("^hello is sent from (.*)$")
    public void whenHelloIsSent(String name) {
        helloService.sendHello(name);
    }
}
