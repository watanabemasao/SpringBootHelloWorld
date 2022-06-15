package com.watanabe.hellowold.domain.hello;

public class HelloEntity {
    private HelloDefinition id;
    private String country;
    private String capital;
    private String greeting;
    private String time;

    public HelloEntity(HelloDefinition id, String country, String capital, String greeting, String time) {
        this.id = id;
        this.country = country;
        this.capital = capital;
        this.greeting = greeting;
        this.time = time;
    }

    public HelloDefinition getId() {
        return id;
    }

    public String getCapital() {
        return country;
    }

    public String getCountry() {
        return capital;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getTime() {
        return time;
    }
}
