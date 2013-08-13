Feature: Sample Hello Feature

  Scenario: Spring sample message received

    Given hello is sent from Cuke
    Then message "Hello, Cuke" should be received

  Scenario: Spring sample message received

    Given hello is sent from Mr Cuke
    Then message "Hello, Cuke" should not be received
