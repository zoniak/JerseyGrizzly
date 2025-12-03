package org.hlanz.model;

public class Message {
    private String greeting;

    private String framework;


    // Constructor
    public Message(String greeting, String framework) {
        this.greeting = greeting;
        this.framework = framework;
    }

    // Getters
    public String getGreeting() {
        return greeting;
    }

    public String getFramework() {
        return framework;
    }

}
