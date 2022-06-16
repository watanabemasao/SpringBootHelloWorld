package com.watanabe.hellowold.domain.hello;

public class HelloEntity {
    private final Domain abbreviation;
    private final String country;
    private final String capital;
    private final String greeting;
    private final String time;

    public HelloEntity(Domain abbreviation, String country, String capital, String greeting, String time) {
        this.abbreviation = abbreviation;
        this.country = country;
        this.capital = capital;
        this.greeting = greeting;
        this.time = time;
    }
}
