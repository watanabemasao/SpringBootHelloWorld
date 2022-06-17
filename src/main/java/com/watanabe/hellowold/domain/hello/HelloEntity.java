package com.watanabe.hellowold.domain.hello;

public class HelloEntity {
    private final Domain domain;
    private final String country;
    private final String capital;
    private final String greeting;
    private final String time;

    public HelloEntity(Domain domain, String country, String capital, String greeting, String time) {
        this.domain = domain;
        this.country = country;
        this.capital = capital;
        this.greeting = greeting;
        this.time = time;
    }

    public Domain getDomain() {
        return domain;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getTime() {
        return time;
    }
}
