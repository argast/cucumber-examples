package com.github.argast.cucumber.examples;

import org.springframework.test.context.ContextConfiguration;

/**
 * Exists to have advantage of Spring context configuration re-usage only.
 */
@ContextConfiguration(locations = "/cucumber.xml")
public class DefaultCucumberSpringContextConfiguration {
}
