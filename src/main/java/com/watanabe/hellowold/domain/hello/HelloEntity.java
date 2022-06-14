package com.watanabe.hellowold.domain.hello;

public class HelloEntity {
    private HelloId id;
    private String country;
    private String capital;
    private String greeting;
    private String time;

    public HelloEntity(HelloId id, String country, String capital, String greeting, String time) {
        this.id = id;
        this.country = country;
        this.capital = capital;
        this.greeting = greeting;
        this.time = time;
    }

    public HelloId id() {
        return id;
    }

    public String country() {
        return country;
    }

    public String capital() {
        return capital;
    }

    public String greeting() {
        return greeting;
    }

    public String time() {
        return time;
    }

}
